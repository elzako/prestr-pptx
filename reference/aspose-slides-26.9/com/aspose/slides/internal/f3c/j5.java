package com.aspose.slides.internal.f3c;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.s3;

public final class j5 {
   private String n5;
   private int l6;
   private c8 k5;
   private int u3;
   private com.aspose.slides.internal.i2i.e2 a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9("Root");

   public j5() {
      this("My", 1);
   }

   public j5(short var1, int var2) {
      if (var1 < 1 || var1 > 8) {
         throw new ArgumentException("storeName");
      }

      if (var2 >= 1 && var2 <= 2) {
         switch (var1) {
            case 3:
               this.n5 = "CA";
               break;
            default:
               this.n5 = s3.n5(l6.class, var1);
         }

         this.l6 = var2;
      } else {
         throw new ArgumentException("storeLocation");
      }
   }

   public j5(String var1, int var2) {
      if (var2 >= 1 && var2 <= 2) {
         this.n5 = var1;
         this.l6 = var2;
      } else {
         throw new ArgumentException("storeLocation");
      }
   }

   public c8 n5() {
      if (this.k5 == null) {
         this.k5 = new c8();
      } else if (this.a6 == null) {
         this.k5.clear();
      }

      return this.k5;
   }

   private com.aspose.slides.internal.i2i.t9 u3() {
      return this.l6 == 1 ? com.aspose.slides.internal.i2i.h0.k5() : com.aspose.slides.internal.i2i.h0.u3();
   }

   public com.aspose.slides.internal.i2i.e2 l6() {
      return this.a6;
   }

   public void k5() {
      this.a6 = null;
      if (this.k5 != null) {
         this.k5.clear();
      }
   }

   public void n5(int var1) {
      if (d1.n5(this.n5)) {
         throw new CryptographicException(d1.n5("Invalid store name (null or empty).", new Object[]{}));
      }

      String var2;
      switch (u9.n5(this.n5)) {
         case 0:
            var2 = "Trust";
            break;
         default:
            var2 = this.n5;
      }

      boolean var3 = (var1 & 4) != 4;
      this.a6 = this.u3().n5(var2, var3);
      if (this.a6 == null) {
         throw new CryptographicException(d1.n5("Store {0} doesn't exists.", new Object[]{this.n5}));
      }

      this.u3 = var1;

      for (Object recoveredElement$var5$2315 : this.a6.n5()) {
         com.aspose.slides.internal.i2i.l6 var5 = (com.aspose.slides.internal.i2i.l6)recoveredElement$var5$2315;
         h0 var6 = new h0(var5.t2());
         var6.n5(var5.c8());
         this.n5().n5(var6);
      }
   }
}
