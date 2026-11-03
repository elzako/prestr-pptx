package com.aspose.slides.internal.w9s;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.l5.c8;
import com.aspose.slides.internal.l5.u9;
import com.aspose.slides.internal.z0k.e2;
import com.aspose.slides.internal.z0k.t4;

public class l6 extends c8 {
   private int n5;
   private com.aspose.slides.internal.d9.n5 l6 = null;
   private com.aspose.slides.internal.l5.u3 k5 = null;
   private e2 u3;

   @Override
   public int E_() {
      switch (this.n5) {
         case 0:
            return this.k5.E_();
         case 1:
            return this.l6.E_();
         default:
            throw new ArgumentOutOfRangeException();
      }
   }

   @Override
   public int F_() {
      switch (this.n5) {
         case 0:
            return this.k5.F_();
         case 1:
            return this.l6.F_();
         default:
            throw new ArgumentOutOfRangeException();
      }
   }

   @Override
   public int u9() {
      switch (this.n5) {
         case 0:
            return this.k5.u9();
         case 1:
            return this.l6.u9();
         default:
            throw new ArgumentOutOfRangeException();
      }
   }

   @Override
   public int h0() {
      switch (this.n5) {
         case 0:
            return this.k5.h0();
         case 1:
            return this.l6.h0();
         default:
            throw new ArgumentOutOfRangeException();
      }
   }

   @Override
   public float c8() {
      switch (this.n5) {
         case 0:
            return this.k5.c8();
         case 1:
            return this.l6.c8();
         default:
            throw new ArgumentOutOfRangeException();
      }
   }

   @Override
   public float t2() {
      switch (this.n5) {
         case 0:
            return this.k5.t2();
         case 1:
            return this.l6.t2();
         default:
            throw new ArgumentOutOfRangeException();
      }
   }

   public l6(int var1, int var2, int var3) {
      this.n5 = var1;
      switch (this.n5) {
         case 0:
            this.n5 = 1;
            this.l6 = new com.aspose.slides.internal.d9.n5(var2, var3);
            break;
         case 1:
            this.l6 = new com.aspose.slides.internal.d9.n5(var2, var3);
            break;
         default:
            throw new ArgumentOutOfRangeException();
      }
   }

   @Override
   public u9 s7() {
      switch (this.n5) {
         case 0:
            return u9.n5(this.k5);
         case 1:
            return u9.n5(this.l6);
         default:
            throw new ArgumentOutOfRangeException();
      }
   }

   @Override
   public void dispose() {
      if (this.l6 != null) {
         this.l6.dispose();
      }

      if (this.k5 != null) {
         this.k5.dispose();
      }

      if (this.u3 != null) {
         this.u3.dispose();
      }
   }

   @Override
   public void a_(t4 var1) {
      switch (this.n5) {
         case 0:
            this.u3.writeTo(var1);
            break;
         case 1:
            this.l6.a_(var1);
            break;
         default:
            throw new ArgumentOutOfRangeException();
      }
   }

   @Override
   public com.aspose.slides.internal.o9b.l6 u3() {
      switch (this.n5) {
         case 0:
            return this.k5.u3();
         case 1:
            return this.l6.u3();
         default:
            throw new ArgumentOutOfRangeException();
      }
   }
}
