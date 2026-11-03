package com.aspose.slides.internal.z8;

import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public abstract class j5 implements IDisposable {
   private com.aspose.slides.internal.z0k.w1 k5;
   private String u3;
   protected int n5;
   private char[] a6 = new char[128];
   private int u9;
   protected int l6;
   private int h0;
   private int c8;
   private boolean t2;

   protected j5(String var1, boolean var2) {
      this.u3 = var1;
      this.t2 = var2;
      this.k5 = new com.aspose.slides.internal.z0k.w1(this.n5());
      this.n5 = this.l6();
   }

   protected j5(com.aspose.slides.internal.l6.n3 var1) {
      this(var1.x8(), false);
   }

   public final String n5() {
      return this.u3;
   }

   public static j5 n5(com.aspose.slides.internal.l6.n3 var0) {
      return new com.aspose.slides.internal.w1.n5(var0);
   }

   protected final int l6() {
      this.n5 = this.k5.u9();
      if (this.t2 && this.n5 == 32) {
         do {
            this.n5 = this.k5.u9();
         } while (this.n5 == 32);
      }

      if (this.n5 == -1) {
         return this.n5;
      }

      if (this.u9 == this.a6.length) {
         char[] var1 = new char[this.a6.length + this.a6.length];
         System.arraycopy(this.a6, 0, var1, 0, this.a6.length);
         this.a6 = var1;
      }

      this.a6[this.u9++] = (char)this.n5;
      return this.n5;
   }

   public final String k5() {
      return d1.n5(this.a6, this.h0, this.c8 - this.h0);
   }

   public final int u3() {
      this.h0 = this.u9 - 1;
      this.a6();
      this.c8 = this.u9 - this.u9();
      return this.l6;
   }

   protected abstract void a6();

   protected int u9() {
      return 0;
   }

   protected final void h0() {
      do {
         this.l6();
      } while (this.n5 != -1);
   }

   @Override
   public final void dispose() {
      if (this.k5 != null) {
         this.k5.dispose();
         this.k5 = null;
      }
   }
}
