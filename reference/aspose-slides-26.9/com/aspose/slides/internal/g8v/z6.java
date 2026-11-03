package com.aspose.slides.internal.g8v;

import com.aspose.slides.exceptions.Exception;
import java.util.concurrent.locks.ReentrantLock;

class z6 implements com.aspose.slides.ms.System.z7 {
   private com.aspose.slides.internal.r5t.k5 n5;
   private boolean l6;
   private boolean k5;
   private y0 u3;
   private Object a6;
   private boolean u9;
   private Exception h0;
   private final Object c8 = new Object();

   private z6(y0 var1) {
      this.u3 = var1;
   }

   protected z6(com.aspose.slides.ms.System.h0 var1, Object var2) {
      this.a6 = var2;
      this.u3 = new e9(this, var1);
   }

   public static void n5(j9 var0, y0 var1) {
      z6 var2 = new z6(var1);

      try {
         if (!var0.n5(var2)) {
            var2.n5(true);
         }
      } catch (Exception var4) {
         var2.n5(true, var4);
      }
   }

   public static void n5(ReentrantLock var0, j9 var1, y0 var2) {
      n5(new o5(var1, var0), new j8(var0, var2));
   }

   protected void u3() {
      this.u9 = false;
      this.h0 = null;
      synchronized (this.c8) {
         this.k5 = false;
         if (this.n5 != null) {
            this.n5.n5();
         }
      }
   }

   void n5(boolean var1, Exception var2) {
      this.l6(var1, var2);
      this.s7();
   }

   void n5(boolean var1) {
      this.l6(var1);
      this.s7();
   }

   protected void l6(boolean var1, Exception var2) {
      this.l6 = var1;
      this.h0 = var2;
      synchronized (this.c8) {
         this.k5 = true;
         if (this.n5 != null) {
            this.n5.l6();
         }
      }
   }

   protected void l6(boolean var1) {
      this.l6 = var1;
      this.h0 = null;
      synchronized (this.c8) {
         this.k5 = true;
         if (this.n5 != null) {
            this.n5.l6();
         }
      }
   }

   private void s7() {
      if (!this.u9) {
         this.u9 = true;
         if (this.u3 != null) {
            this.u3.n5(this);
         }
      }
   }

   protected void a6() {
      if (!this.u9 && this.u3 != null) {
         this.u9 = true;
         this.u3.n5(this);
      }
   }

   void u9() {
      if (!this.k5()) {
         this.l6().a6();
      }
   }

   boolean n5(int var1, boolean var2) {
      return this.k5() ? true : this.l6().n5(var1, var2);
   }

   @Override
   public Object n5() {
      return this.a6;
   }

   @Override
   public com.aspose.slides.internal.r5t.c4 l6() {
      synchronized (this.c8) {
         if (this.n5 == null) {
            this.n5 = new com.aspose.slides.internal.r5t.k5(this.k5);
         }
      }

      return this.n5;
   }

   public boolean h0() {
      return this.l6;
   }

   @Override
   public boolean k5() {
      synchronized (this.c8) {
         return this.k5;
      }
   }

   boolean c8() {
      return this.h0 != null;
   }

   Exception t2() {
      return this.h0;
   }
}
