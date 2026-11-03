package com.aspose.slides.internal.g3x;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ExternalException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.l9o.f0;
import com.aspose.slides.internal.l9o.v0;
import com.aspose.slides.internal.o9b.y2;

public class l6 {
   private final Object n5 = new Object();
   private Boolean l6 = false;
   private com.aspose.slides.internal.o9b.l6 k5;
   private k5 u3;
   private com.aspose.slides.internal.b9b.n5 a6 = new com.aspose.slides.internal.b9b.n5();
   private com.aspose.slides.internal.d9v.n5 u9 = new com.aspose.slides.internal.d9v.n5();

   public l6(com.aspose.slides.internal.o9b.l6 var1) {
      this.k5 = var1;
   }

   public com.aspose.slides.internal.j9e.n5 n5(y2 var1, int var2, int var3, boolean var4) {
      synchronized (this.n5) {
         if (this.n5()) {
            throw new InvalidOperationException("Bitmap is already locked");
         }

         k5 var6 = new k5(var1.n3(), var2, var3);
         v0 var7 = this.n5(this.k5, var6);
         com.aspose.slides.internal.j9e.n5 var8 = var7.n5(var4);
         this.l6();
         this.u3 = var6;
         return var8;
      }
   }

   public void n5(com.aspose.slides.internal.j9e.n5 var1) {
      if (var1 == null) {
         throw new ArgumentException("Parameter is not valid");
      }

      synchronized (this.n5) {
         if (!this.n5()) {
            throw new ExternalException("Image is not locked");
         }

         f0 var3 = this.l6(var1);
         var3.x8();
         this.k5();
      }
   }

   public boolean n5() {
      return this.l6;
   }

   private void l6() {
      this.l6 = true;
   }

   private void k5() {
      this.l6 = false;
   }

   private v0 n5(com.aspose.slides.internal.o9b.l6 var1, k5 var2) {
      return this.a6.n5(var1, var2);
   }

   private f0 l6(com.aspose.slides.internal.j9e.n5 var1) {
      return this.u9.n5(this.k5, this.u3, var1);
   }
}
