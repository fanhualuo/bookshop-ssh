package com.file.action;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.bean.Book;
import com.opensymphony.xwork2.ActionSupport;
import com.ssh.service.BookService;

//文件上传
@Controller // 标识层
@Scope("prototype")
public class FileUploadAction extends ActionSupport {

	private static final long serialVersionUID = -3197907732460453532L;
	
	private File file;// 上传文件	
	private String fileContentType;// 上传文件的类型	
	private String fileFileName;// 上传文件的名称	
	private BookService bookService;
	@Autowired
	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}
	private int id;//上传图片的图书id
	public void setId(int id) {
		this.id = id;
	}
	public File getFile() {
		return file;
	}
	public String getFileContentType() {
		return fileContentType;
	}
	public String getFileFileName() {
		return fileFileName;
	}
	public void setFile(File file) {
		this.file = file;
	}
	public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
	}
	public void setFileFileName(String fileFileName) {
		int pos = fileFileName.lastIndexOf( "." );   
		String type1= fileFileName.substring(pos); //获取文件后缀
		
		int s1=(int) (Math.random()*10000);//产生随机数
		Date date=new Date();
		DateFormat format=new SimpleDateFormat("yyyyMMddHHmmss");//获取当前时间
		String s2=format.format(date);
		fileFileName=s1+s2+type1;//文件名为产生的随机数和当前时间和后缀
		this.fileFileName = fileFileName;
	}
	
	public String upload() throws Exception{
		
		//获取上传路径（服务器的路径）
		String path=ServletActionContext.getServletContext().getRealPath("/file");
		File savefile=new File(new File(path),fileFileName);
		if (file!=null) {
			if (!savefile.getParentFile().exists()) {
				//不存在目录，创建
				savefile.getParentFile().mkdirs();				
			}
			FileUtils.copyFile(file, savefile); 
			Book book=bookService.FindById(id);
			book.setImg(fileFileName);
			bookService.update(book);
		}
		
		return SUCCESS;
		
	}
	
}

