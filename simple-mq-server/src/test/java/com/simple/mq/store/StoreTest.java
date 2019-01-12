package com.simple.mq.store;

import org.csource.common.NameValuePair;
import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.FileInfo;
import org.csource.fastdfs.ProtoCommon;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.StorageServer;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;

import java.io.File;

/**
 * @author wuping
 * @date 2019/1/11
 */

public class StoreTest {
    public static void main(String[] args) throws Exception {
        String propFilePath = "/Users/wp/Documents/code/self/study/simple-mq/simple-mq-server/src/main/resources/application.properties";
        ClientGlobal.initByProperties(propFilePath);
        System.out.println("ClientGlobal.configInfo() : " + ClientGlobal.configInfo());
        TrackerClient tracker = new TrackerClient();
        TrackerServer trackerServer = tracker.getConnection();
        StorageServer storageServer = null;
        StorageClient storageClient = new StorageClient(trackerServer, storageServer);
//        NameValuePair[] nvp = new NameValuePair[100];
//        for (int i = 0; i < 100; i++) {
//            nvp[i] = new NameValuePair(i + "", i + "");
//
//        }
//        File file = new File("test.data");
//        if (!file.exists()) {
//            file.createNewFile();
//        }
//        String[] fileIds = storageClient.upload_file("test.data", "data1", nvp);
//        System.out.println(fileIds.length);
//        System.out.println("组名：" + fileIds[0]);
//        System.out.println("路径：" + fileIds[1]);
//        String group = "group1";
//        String path = "M00/00/00/rBAADlw4YsWAfB71AAAAAAAAAAA26.data";
//        NameValuePair[] nvps  = storageClient.get_metadata(group, path);
//        FileInfo fi = storageClient.get_file_info("group1", "M00/00/00/rBAADlw4YsWAfB71AAAAAAAAAAA26.data");
//        storageClient.set_metadata("group1", path, nvp, ProtoCommon.STORAGE_SET_METADATA_FLAG_MERGE);
//        NameValuePair[] nvps = storageClient.get_metadata("group1", path);
//        System.out.println(nvps.length);
        String path = "M00/00/00/rBAADlw4diCACqYXAAAACQBw-ZE9.data1";
        String group = "group1";
        NameValuePair[] nvps  = storageClient.get_metadata(group, path);
        System.out.println(nvps.length);
        for (int i = 0; i < 100; i++) {
            System.out.println(nvps[i].getName() + ":" + nvps[i].getValue());
        }
        FileInfo fi = storageClient.get_file_info(group, path);
        fi.getFileSize();
        byte[] bytes = storageClient.download_file(group, path);
        System.out.println(new String(bytes));
    }
}
