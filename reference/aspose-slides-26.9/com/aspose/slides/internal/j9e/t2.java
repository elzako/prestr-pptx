package com.aspose.slides.internal.j9e;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.v4;

public final class t2 implements IDisposable, v4 {
   private t2$n5 k5;
   private t2$n5 u3;
   private t2$n5 a6;
   private t2$n5 u9;
   private t2$n5 h0;
   public int n5 = 4;
   private boolean c8 = false;
   public com.aspose.slides.internal.o9b.c8 l6;

   @Override
   public void dispose() {
   }

   @Override
   public Object deepClone() {
      t2 var1 = new t2();
      var1.k5 = this.k5 != null ? this.k5.n5() : null;
      var1.u3 = this.u3 != null ? this.u3.n5() : null;
      var1.a6 = this.a6 != null ? this.a6.n5() : null;
      var1.u9 = this.u9 != null ? this.u9.n5() : null;
      var1.h0 = this.h0 != null ? this.h0.n5() : null;
      var1.l6 = this.l6 != null ? this.l6.o8() : null;
      var1.n5 = this.n5;
      return var1;
   }

   public t2$n5 n5(int var1) {
      t2$n5 var2 = this.k5 != null ? this.k5 : new t2$n5(this);
      switch (var1) {
         case 0:
            this.k5 = var2.n5();
            return this.k5;
         case 1:
            if (this.u3 == null) {
               this.u3 = var2.n5();
            }

            return this.u3;
         case 2:
            if (this.a6 == null) {
               this.a6 = var2.n5();
            }

            return this.a6;
         case 3:
            if (this.u9 == null) {
               this.u9 = var2.n5();
            }

            return this.u9;
         case 4:
            if (this.h0 == null) {
               this.h0 = var2.n5();
            }

            return this.h0;
         default:
            return null;
      }
   }

   public void n5(k5 var1) {
      this.n5(var1, 0, 0);
   }

   public void n5(k5 var1, int var2, int var3) {
      this.n5(var3).n5 = var1;
      this.n5(var3).l6 = var2;
   }

   public void n5(com.aspose.slides.internal.o9b.c8 var1, com.aspose.slides.internal.o9b.c8 var2) {
      this.n5(var1.o8(), var2.o8(), 0);
   }

   public void n5(com.aspose.slides.internal.o9b.c8 var1, com.aspose.slides.internal.o9b.c8 var2, int var3) {
      if ((var1.x8() & 255) <= (var2.x8() & 255) && (var1.n3() & 255) <= (var2.n3() & 255) && (var1.y4() & 255) <= (var2.y4() & 255)) {
         var1.n5(this.n5(var3).s7);
         var2.n5(this.n5(var3).x8);
      } else {
         throw new ArgumentException();
      }
   }

   public void n5(l6[] var1) {
      this.n5(var1, 0);
   }

   public void n5(l6[] var1, int var2) {
      this.n5(var2).n3 = var1;
   }

   public boolean n5() {
      return this.c8;
   }

   public void l6(int var1) {
      this.n5(var1, new com.aspose.slides.internal.o9b.c8(), false);
   }

   public void n5(int var1, com.aspose.slides.internal.o9b.c8 var2) {
      this.n5(var1, var2.o8(), false);
   }

   public void n5(int var1, com.aspose.slides.internal.o9b.c8 var2, boolean var3) {
      this.c8 = true;
      this.n5 = var1;
      if (this.l6 == null) {
         this.l6 = var2.o8();
      } else {
         var2.n5(this.l6);
      }

      this.n5(0).y4 = var3;
   }
}
