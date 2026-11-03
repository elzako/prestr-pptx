package com.aspose.slides.internal.z0k;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.DirectoryNotFoundException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.p8;
import java.io.File;

@j3
public final class a6 extends y4 {
   private String u3;
   private String a6;

   public a6(String var1) {
      this(var1, false);
   }

   a6(String var1, boolean var2) {
      this.k5(var1);
      this.n5 = z1.k5(var1);
      if (var2) {
         this.l6 = z1.n5(var1);
      } else {
         this.l6 = var1;
      }

      this.c8();
   }

   private void c8() {
      int var1 = this.n5.length() - 1;
      if (var1 > 1 && this.n5.charAt(var1) == z1.k5) {
         var1--;
      }

      int var2 = d1.n5(this.n5, z1.k5, var1);
      if (var2 != -1 && (var2 != 0 || var1 != 0)) {
         this.u3 = d1.l6(this.n5, var2 + 1, var1 - var2);
         if (var2 == 0 && !p8.l6) {
            this.a6 = d1.n5(z1.k5);
         } else {
            this.a6 = d1.l6(this.n5, 0, var2);
         }

         if (p8.l6 && this.a6.length() == 2 && this.a6.charAt(1) == ':' && Character.isLetter(this.a6.charAt(0))) {
            this.a6 = d1.l6(this.a6, z1.k5);
         }
      } else {
         this.u3 = this.n5;
         this.a6 = null;
      }
   }

   public boolean n5() {
      return new File(this.n5).exists();
   }

   @Override
   public String l6() {
      return this.u3;
   }

   public void k5() {
      com.aspose.slides.internal.z0k.u3.n5(this.n5);
   }

   public t2[] u3() {
      return this.n5("*");
   }

   public t2[] n5(String var1) {
      if (var1 == null) {
         throw new ArgumentNullException("searchPattern");
      }

      if (!this.n5()) {
         throw new DirectoryNotFoundException(this.n5);
      }

      String[] var2 = com.aspose.slides.internal.z0k.u3.l6(this.n5, var1);
      t2[] var3 = new t2[var2.length];
      int var4 = 0;

      for (String var8 : var2) {
         var3[var4++] = new t2(var8);
      }

      return var3;
   }

   public a6[] a6() {
      return this.l6("*");
   }

   public a6[] l6(String var1) {
      if (var1 == null) {
         throw new ArgumentNullException("searchPattern");
      }

      if (!this.n5()) {
         throw new DirectoryNotFoundException(this.n5);
      }

      String[] var2 = com.aspose.slides.internal.z0k.u3.n5(this.n5, var1);
      a6[] var3 = new a6[var2.length];
      int var4 = 0;

      for (String var8 : var2) {
         var3[var4++] = new a6(var8);
      }

      return var3;
   }

   public void n5(boolean var1) {
      com.aspose.slides.internal.z0k.u3.n5(this.n5, var1);
   }

   @Override
   public String toString() {
      return this.l6;
   }
}
