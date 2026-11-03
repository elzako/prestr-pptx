package com.aspose.slides.internal.o0;

import com.aspose.slides.ms.System.d1;

public class l6 {
   private final String n5;
   private final String l6;

   public l6(String var1, String var2, String var3) {
      this.n5 = d1.n5(new String[]{var2, ":", var3});
      this.l6 = var1;
   }

   public l6(String var1, String var2) {
      this.n5 = var2;
      this.l6 = var1;
   }

   public final String n5() {
      if (d1.c8(this.n5, ":") != -1) {
         String[] var1 = d1.n5(this.n5, ':');
         return var1[1];
      } else {
         return this.n5;
      }
   }

   public final String l6() {
      return this.n5;
   }
}
