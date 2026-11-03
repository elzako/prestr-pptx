package com.aspose.slides.internal.o8m;

import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.ms.System.IDisposable;

public abstract class a6 implements IDisposable {
   protected int n5;
   protected e5[] l6;

   protected a6() {
   }

   public int n5() {
      return this.n5;
   }

   public void n5(int var1) {
      if (!e5.n5(this.l6, var1)) {
         throw new CryptographicException(com.aspose.slides.internal.x8w.z3.n5("Key size not supported by algorithm."));
      }

      this.n5 = var1;
   }

   @Override
   public void dispose() {
      this.n5(true);
      com.aspose.slides.ms.System.e5.n5(this);
   }

   public void l6() {
      this.n5(false);
   }

   protected abstract void n5(boolean var1);

   static byte[] n5(String var0, String var1) {
      String var2 = "<" + var1 + ">";
      int var3 = var0.indexOf(var2);
      if (var3 == -1) {
         return null;
      } else {
         String var4 = "</" + var1 + ">";
         int var5 = var0.indexOf(var4);
         if (var5 != -1 && var5 > var3) {
            var3 += var2.length();
            String var6 = var0.substring(var3, var3 + (var5 - var3));
            return com.aspose.slides.ms.System.z3.s7(var6);
         } else {
            return null;
         }
      }
   }

   @Override
   public String toString() {
      String var1 = com.aspose.slides.ms.System.j8.n5(this).s7().substring(com.aspose.slides.ms.System.j8.n5(this).s7().lastIndexOf(46) + 1);
      return "System.Security.Cryptography." + var1;
   }
}
