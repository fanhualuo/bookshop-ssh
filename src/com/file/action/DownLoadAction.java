package com.file.action;

import java.io.FileInputStream;
import java.io.InputStream;
import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

//文件下载
@Controller // 标识层
@Scope("prototype")
public class DownLoadAction extends ActionSupport {
	private static final long serialVersionUID = 1774493022013409590L;

	//private String fileContentType;// 上传文件的类型
	private String fileFileName;// 上传文件的名称
	//private long fileLength;// 指定下载文件的长度
	//private String fileDisposition;// 下载文件的下载方式，并指定保存文件的文件名
	private InputStream inputStream;// 指定文件读数据流

	public void setFileFileName(String fileFileName) throws Exception  {
		this.fileFileName = fileFileName;
	}

	public String getFileFileName() throws Exception {
		return fileFileName;
	}

	

	public InputStream getInputStream() {
		return inputStream;
	}


	
	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}

	public String download() throws Exception {
		
		String fileNameFrom=ServletActionContext.getServletContext().getRealPath("/file/")+fileFileName;
		
		inputStream=new FileInputStream(fileNameFrom);
		//fileLength=inputStream.available();//指定下载的长度
		
		return SUCCESS;
	}

}
