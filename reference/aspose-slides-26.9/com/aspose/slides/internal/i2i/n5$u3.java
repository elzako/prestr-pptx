package com.aspose.slides.internal.i2i;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.exceptions.ArgumentException;

public class n5$u3 {
   private byte n5 = 1;
   private String l6;
   private ArrayList k5 = new ArrayList();
   private ArrayList u3 = new ArrayList();
   private byte[] a6;
   private String u9;
   private byte[] h0;
   private byte[] c8;

   public n5$u3() {
   }

   public n5$u3(com.aspose.slides.internal.x8w.l6 var1) {
      this();
      if (var1.n5(0).l6() != 48 || var1.n5(0).n5() < 5) {
         throw new ArgumentException("Invalid SignedData");
      }

      if (var1.n5(0).n5(0).l6() != 2) {
         throw new ArgumentException("Invalid version");
      }

      this.n5 = var1.n5(0).n5(0).u3()[0];
      com.aspose.slides.internal.x8w.l6 var2 = var1.n5(0).n5(1);
      if ((var2.l6() & 255) == 128 && this.n5 == 3) {
         this.c8 = var2.u3();
      } else {
         this.u9 = n3.n5(var2.n5(0));
         this.h0 = var2.n5(1).u3();
      }

      com.aspose.slides.internal.x8w.l6 var3 = var1.n5(0).n5(2);
      this.l6 = com.aspose.slides.internal.x8w.k5.l6(var3.n5(0));
      int var4 = 3;
      com.aspose.slides.internal.x8w.l6 var5 = var1.n5(0).n5(var4);
      if ((var5.l6() & 255) == 160) {
         var4++;

         for (int var6 = 0; var6 < var5.n5(); var6++) {
            this.k5.addItem(var5.n5(var6));
         }
      }

      var4++;
      com.aspose.slides.internal.x8w.l6 var11 = var1.n5(0).n5(var4++);
      if (var11.l6() == 4) {
         this.a6 = var11.u3();
      }

      com.aspose.slides.internal.x8w.l6 var7 = var1.n5(0).n5(var4);
      if (var7 != null && (var7.l6() & 255) == 161) {
         for (int var8 = 0; var8 < var7.n5(); var8++) {
            this.u3.addItem(var7.n5(var8));
         }
      }
   }

   public String n5() {
      return this.u9;
   }

   public ArrayList l6() {
      return this.k5;
   }

   public String k5() {
      return this.l6;
   }

   public void n5(String var1) {
      this.l6 = var1;
   }
}
