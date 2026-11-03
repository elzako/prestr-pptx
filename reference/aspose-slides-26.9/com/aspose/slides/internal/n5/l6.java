package com.aspose.slides.internal.n5;

import java.io.IOException;
import java.io.Reader;

public class l6 extends k5 {
   public void n5(Reader var1, int var2, int var3) throws IOException {
      if (var1 != null) {
         if (var2 <= 0) {
            var2 = 1024;
         }

         if (var3 <= 0) {
            var3 = 1024;
         }

         try {
            this.n5 = new char[var2];
            int var4 = 0;
            int var5 = 0;

            do {
               if (var5 + var3 > this.n5.length) {
                  char[] var6 = new char[this.n5.length * 2];
                  System.arraycopy(this.n5, 0, var6, 0, this.n5.length);
                  this.n5 = var6;
               }

               var4 = var1.read(this.n5, var5, var3);
               var5 += var4;
            } while (var4 != -1);

            super.l6 = var5 + 1;
         } finally {
            var1.close();
         }
      }
   }
}
