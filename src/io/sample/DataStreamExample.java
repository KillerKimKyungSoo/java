package io.sample;

import oracle.jdbc.internal.CompletionStageUtil;

import java.io.*;

public class DataStreamExample {
    public static void main(String[] args) {
        String fileName = "person.dat";
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))){
            dos.writeUTF("홍길동");
            dos.writeInt(30);
            dos.writeDouble(175.1);
            dos.writeBoolean(true);
            System.out.println("데이터저장완료 " + fileName);
        }catch (IOException e){
            e.printStackTrace();
        }
        try(DataInputStream dis = new DataInputStream(new FileInputStream(fileName))){
            String name = dis.readUTF();
            int age = dis.readInt();
            double height = dis.readDouble();
            boolean vip = dis.readBoolean();
            System.out.println("데이터 일기 결과 ");
            System.out.println("이름: " + name);
            System.out.println("나이: " + age);
            System.out.println("키: " + height);
            System.out.println("VIP 여부: " + vip);
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
