package com.aspose.slides.internal.o8m;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.Exception;

public abstract class z3 extends a6 {
   protected z3() {
   }

   public static z3 k5() {
      return n5(m1.class.getName());
   }

   public static z3 n5(String var0) {
      return (z3)y4.n5(var0);
   }

   public abstract byte[] n5(byte[] var1);

   public abstract m3 l6(boolean var1);

   void n5(m3 var1) {
      if (var1.h0 != null) {
         com.aspose.slides.ms.System.u3.n5(var1.h0, 0, var1.h0.length);
      }
   }

   public void l6(String var1) {
      if (var1 == null) {
         throw new ArgumentNullException("xmlString");
      }

      m3 var2 = new m3();

      try {
         var2.u3 = n5(var1, "P");
         var2.a6 = n5(var1, "Q");
         var2.l6 = n5(var1, "G");
         var2.k5 = n5(var1, "J");
         var2.c8 = n5(var1, "Y");
         var2.h0 = n5(var1, "X");
         var2.u9 = n5(var1, "Seed");
         byte[] var3 = n5(var1, "PgenCounter");
         if (var3 != null) {
            byte[] var4 = new byte[4];
            com.aspose.slides.ms.System.y4.n5(var3, 0, var4, 0, var3.length);
            var2.n5 = com.aspose.slides.ms.System.x8.a6(var4, 0);
         }

         this.l6(var2.n5());
      } catch (Exception var8) {
         this.n5(var2.n5());
         throw var8;
      } finally {
         this.n5(var2.n5());
      }
   }

   public abstract void l6(m3 var1);

   public String k5(boolean var1) {
      StringBuilder var2 = new StringBuilder();
      m3 var3 = this.l6(var1).n5();

      try {
         var2.append("<DSAKeyValue>");
         var2.append("<P>");
         var2.append(com.aspose.slides.ms.System.z3.n5(var3.u3));
         var2.append("</P>");
         var2.append("<Q>");
         var2.append(com.aspose.slides.ms.System.z3.n5(var3.a6));
         var2.append("</Q>");
         var2.append("<G>");
         var2.append(com.aspose.slides.ms.System.z3.n5(var3.l6));
         var2.append("</G>");
         var2.append("<Y>");
         var2.append(com.aspose.slides.ms.System.z3.n5(var3.c8));
         var2.append("</Y>");
         if (var3.k5 != null) {
            var2.append("<J>");
            var2.append(com.aspose.slides.ms.System.z3.n5(var3.k5));
            var2.append("</J>");
         }

         if (var3.u9 != null) {
            var2.append("<Seed>");
            var2.append(com.aspose.slides.ms.System.z3.n5(var3.u9));
            var2.append("</Seed>");
            var2.append("<PgenCounter>");
            if (var3.n5 != 0) {
               byte[] var4 = com.aspose.slides.ms.System.x8.l6(var3.n5);
               int var5 = var4.length;

               while (var4[var5 - 1] == 0) {
                  var5--;
               }

               var2.append(com.aspose.slides.ms.System.z3.n5(var4, 0, var5));
            } else {
               var2.append("AA==");
            }

            var2.append("</PgenCounter>");
         }

         if (var3.h0 != null) {
            var2.append("<X>");
            var2.append(com.aspose.slides.ms.System.z3.n5(var3.h0));
            var2.append("</X>");
         } else if (var1) {
            throw new ArgumentException("X");
         }

         var2.append("</DSAKeyValue>");
      } catch (RuntimeException var6) {
         this.n5(var3.n5());
         throw var6;
      }

      return var2.toString();
   }

   public abstract boolean n5(byte[] var1, byte[] var2);
}
