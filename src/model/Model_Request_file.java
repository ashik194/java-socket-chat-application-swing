package model;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ORANGEBD
 */
public class Model_Request_file {
    public int getFileID() {
        return fileID;
    }

    public void setFileID(int fileID) {
        this.fileID = fileID;
    }

    public long getCurrentLength() {
        return currentLength;
    }

    public void setCurrentLength(long currentLength) {
        this.currentLength = currentLength;
    }

    public Model_Request_file(int fileID, long currentLength) {
        this.fileID = fileID;
        this.currentLength = currentLength;
    }

    public Model_Request_file() {
    }

    private int fileID;
    private long currentLength;
}
