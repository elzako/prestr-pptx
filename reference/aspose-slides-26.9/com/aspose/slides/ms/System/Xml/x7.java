package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.internal.b8c.j9e;
import com.aspose.slides.internal.b8c.l2;
import com.aspose.slides.internal.b8c.u1s;
import com.aspose.slides.internal.b8c.v1;

public class x7 implements com.aspose.slides.internal.b8c.u4 {
   private String k5;
   private String u3;
   private String a6;
   private String u9;
   private int h0;
   public XmlDocument n5;
   public x7 l6;

   public static x7 n5(String var0, String var1, String var2, int var3, XmlDocument var4, x7 var5, com.aspose.slides.internal.b8c.u4 var6) {
      return var6 == null ? new x7(var0, var1, var2, var3, var4, var5) : new z0(var0, var1, var2, var3, var4, var5, var6);
   }

   public x7(String var1, String var2, String var3, int var4, XmlDocument var5, x7 var6) {
      this.k5 = var1;
      this.u3 = var2;
      this.a6 = var3;
      this.u9 = null;
      this.h0 = var4;
      this.n5 = var5;
      this.l6 = var6;
   }

   public final String c8() {
      return this.u3;
   }

   public final String t2() {
      return this.a6;
   }

   public final String s7() {
      return this.k5;
   }

   @Override
   public final int hashCode() {
      return this.h0;
   }

   public final XmlDocument x8() {
      return this.n5;
   }

   public final String n3() {
      if (this.u9 == null) {
         if (this.k5.length() > 0) {
            if (this.u3.length() > 0) {
               String var1 = com.aspose.slides.ms.System.d1.n5(new String[]{this.k5, ":", this.u3});
               synchronized (this.n5.getNameTable()) {
                  if (this.u9 == null) {
                     this.u9 = this.n5.getNameTable().n5(var1);
                  }
               }
            } else {
               this.u9 = this.k5;
            }
         } else {
            this.u9 = this.u3;
         }
      }

      return this.u9;
   }

   @Override
   public int ak_() {
      return 0;
   }

   @Override
   public boolean l6() {
      return false;
   }

   @Override
   public boolean aj_() {
      return false;
   }

   @Override
   public u1s al_() {
      return null;
   }

   @Override
   public j9e am_() {
      return null;
   }

   @Override
   public v1 an_() {
      return null;
   }

   @Override
   public l2 ao_() {
      return null;
   }

   public boolean n5(com.aspose.slides.internal.b8c.u4 var1) {
      return var1 == null;
   }

   public static int n5(String var0) {
      int var1 = 0;
      if (var0 != null) {
         for (int var2 = var0.length() - 1; var2 >= 0; var2--) {
            char var3 = var0.charAt(var2);
            if (var3 == ':') {
               break;
            }

            var1 += var1 << 7 ^ var3;
         }

         var1 -= var1 >> 17;
         var1 -= var1 >> 11;
         var1 -= var1 >> 5;
      }

      return var1;
   }
}
