/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspertemuanke10;


import javax.swing.JOptionPane;
public class array2dimensi {
   public static void main(String[] args) {
       
        System.out.println("ARRAY 2 dimensi untuk String");
        System.out.println("---------DATA JURUSAN UNU BLITAR---------");
        String jurusan[][] = {{"01", "ILMU KOMPUTER"}, 
                              {"02", "PGSD"}, 
                              {"03", "MATEMATIKA"},
                              {"04", "FISIKA"},
                              {"05", "BAHASA INGGRIS"},
                              {"06", "TEKNIK SIPIL"},
                              {"06", "PETERNAKAN"}};         
        for (int i = 0; i < jurusan.length; i++) {
            for (int j = 0; j < jurusan[0].length; j++) {
                System.out.print(jurusan[i][j] + " ");
            }
            System.out.println(" ");
        }
        String cari = JOptionPane.showInputDialog(null," Cari Jurusan berdasarkan Kode Jurusan");
        for (int i =0; i< jurusan.length; i++ ){
            for (int j =0; j < jurusan[0].length; j++){
                if(jurusan[i][j].equals(cari)){
                    JOptionPane.showMessageDialog(null, "Jurusan dengan Kode Jurusan " + cari+ " Ditemukan berjudul " + jurusan[i][j+1]);
                }
            }
        
          }
    
        }
    }
 

