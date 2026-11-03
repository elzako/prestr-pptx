package com.aspose.slides.internal.i2i;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.o8m.e9;
import com.aspose.slides.internal.o8m.m1;
import com.aspose.slides.internal.x8w.q0;
import com.aspose.slides.internal.z0k.z1;
import com.aspose.slides.ms.System.d1;

public class e2 {
   private String n5;
   private k5 l6;
   private ArrayList k5;
   private boolean u3;

   e2(String var1, boolean var2) {
      this.n5 = var1;
      this.u3 = var2;
   }

   public k5 n5() {
      if (this.l6 == null) {
         this.l6 = this.u3(this.n5);
      }

      return this.l6;
   }

   public ArrayList l6() {
      if (!this.u3) {
         this.k5 = new ArrayList();
      }

      if (this.k5 == null) {
         this.k5 = this.a6(this.n5);
      }

      return this.k5;
   }

   private byte[] n5(String var1) {
      byte[] var2 = null;
      com.aspose.slides.internal.z0k.n3 var3 = com.aspose.slides.internal.z0k.u9.u3(var1);

      try {
         var2 = new byte[(int)var3.getLength()];
         var3.read((byte[])var2, 0, ((byte[])var2).length);
         var3.close();
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }

      return (byte[])var2;
   }

   private l6 l6(String var1) {
      byte[] var2 = this.n5(var1);
      l6 var3 = new l6(var2);
      com.aspose.slides.internal.o8m.t9 var4 = new com.aspose.slides.internal.o8m.t9();
      var4.n5 = com.aspose.slides.internal.x8w.n3.n5(var3.k5());
      if (d1.l6(this.n5, h0.l6())) {
         var4.n5(1);
      }

      q0 var5 = new q0(var4);
      if (!var5.k5()) {
         return var3;
      }

      if (var3.c8() != null) {
         var3.n5(new e9(var4));
      } else if (var3.n5() != null) {
         var3.n5(new m1(var4));
      }

      return var3;
   }

   private y4 k5(String var1) {
      byte[] var2 = this.n5(var1);
      return new y4(var2);
   }

   private boolean n5(String var1, boolean var2) {
      try {
         if (com.aspose.slides.internal.z0k.u3.k5(var1)) {
            return true;
         }

         com.aspose.slides.internal.z0k.u3.n5(var1);
         return com.aspose.slides.internal.z0k.u3.k5(var1);
      } catch (Exception var4) {
         if (var2) {
            throw var4;
         } else {
            return false;
         }
      }
   }

   private k5 u3(String var1) {
      k5 var2 = new k5();
      String var3 = z1.l6(this.n5, var1);
      if (!this.n5(var3, false)) {
         return var2;
      }

      String[] var4 = com.aspose.slides.internal.z0k.u3.l6(var3, "*.cer");
      if (var4 != null && var4.length > 0) {
         for (String var8 : var4) {
            try {
               l6 var9 = this.l6(var8);
               var2.n5(var9);
            } catch (java.lang.Exception var10) {
            }
         }
      }

      return var2;
   }

   private ArrayList a6(String var1) {
      ArrayList var2 = new ArrayList();
      String var3 = z1.l6(this.n5, var1);
      if (!this.n5(var3, false)) {
         return var2;
      }

      String[] var4 = com.aspose.slides.internal.z0k.u3.l6(var3, "*.crl");
      if (var4 != null && var4.length > 0) {
         for (String var8 : var4) {
            try {
               y4 var9 = this.k5(var8);
               var2.addItem(var9);
            } catch (java.lang.Exception var10) {
            }
         }
      }

      return var2;
   }
}
