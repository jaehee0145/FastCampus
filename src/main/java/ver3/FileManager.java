package ver3;

import my.examples.ioexam.Folder;



public class FileManager {
//같은 코드도 에러가 난다 ..ㅜㅜ
    // 찾았다! 역시! 코드는 거짓말을 못해

//    public static Folder scan(String folderDir) {
//        java.io.File file = new java.io.File(folderDir);
//        if (!file.exists()) {
//            throw new RuntimeException("폴더가 없습니다.");
//        }
//        if (!file.isDirectory()) {
//            throw new RuntimeException("폴더가 아닙니다.");
//        }
//
//        Folder folder = new Folder(file.getParentFile().getAbsolutePath(), file.getName());
//        scanFolder(folder, file);
//        return folder;
//    }
//
//    public static void scanFolder(Folder folder, java.io.File file ){
//        File[] files = file.listFiles();
//        for(File f: files){
//            if(f.isFile()){
//                File childFile = new File(file.getAbsolutePath(), f.getName());
//                childFile.setSize(f.length());
//            }
//        }
//    }

}
