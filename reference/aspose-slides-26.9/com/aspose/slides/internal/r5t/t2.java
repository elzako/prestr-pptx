package com.aspose.slides.internal.r5t;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.z6;
import java.util.Locale;

public final class t2 extends com.aspose.slides.internal.p6t.n5 {
   private Thread n5;
   private com.aspose.slides.internal.x7n.l6 l6;
   private com.aspose.slides.internal.x7n.l6 k5;
   private int u3 = 2;
   private boolean a6 = false;
   private String u9;
   private int h0 = 8;
   private final Object c8 = new Object();
   private Object t2 = null;
   private boolean s7 = false;
   private static int x8 = 0;
   private static final ThreadLocal<t2> n3 = new ThreadLocal<>();
   private static final ThreadLocal<Object> y4 = new ThreadLocal<>();
   private z6 e2;

   private t2(Thread var1) {
      this.n5 = var1;
      this.u9 = var1.getName();
   }

   public t2(m1 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("Null ThreadStart");
      }

      s7 var2 = new s7(this, var1);
      this.e2 = var2;
      this.n5 = this.n5(var2);
   }

   public t2(u9 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("start");
      }

      x8 var2 = new x8(this, var1);
      this.e2 = var2;
      this.n5 = this.n5(var2);
   }

   private Thread n5(m1 var1) {
      return new Thread(this.s7(), new n3(this, var1), this.x8());
   }

   public static t2 n5() {
      t2 var0 = n3.get();
      if (var0 == null) {
         var0 = new t2(Thread.currentThread());
         n3.set(var0);
      }

      return var0;
   }

   private Thread n5(u9 var1) {
      return new Thread(this.s7(), new y4(this, var1), this.x8());
   }

   private ThreadGroup s7() {
      return Thread.currentThread().getThreadGroup();
   }

   private String x8() {
      synchronized (this.c8) {
         x8++;
      }

      return d1.n5("{0}_{1}", this.s7(), x8);
   }

   public void l6() {
      try {
         this.h0 |= 128;
         this.n5.checkAccess();
         if (!this.n5.isAlive()) {
            this.s7 = true;
         } else {
            if ((this.h0 & 64) == 64) {
               throw new m3();
            }

            this.n5.stop();
            this.h0 = 256;
            throw new e2();
         }
      } catch (SecurityException var2) {
         throw new com.aspose.slides.exceptions.SecurityException(var2.getMessage());
      }
   }

   @Override
   public void finalize() throws Throwable {
      super.finalize();
   }

   public void k5() {
      try {
         this.h0 = 16;
         this.n5.interrupt();
      } catch (SecurityException var2) {
         throw new com.aspose.slides.exceptions.SecurityException(var2.getMessage());
      }
   }

   public void u3() {
      try {
         this.h0 |= 32;
         this.n5.join();
      } catch (InterruptedException var2) {
         throw new t9();
      }
   }

   public boolean n5(int var1) {
      if (var1 < -1) {
         throw new ArgumentOutOfRangeException("timeout");
      }

      try {
         if (var1 == -1) {
            var1 = 0;
         } else if (var1 == 0) {
            var1 = 1;
         }

         this.h0 |= 32;
         this.n5.join(var1);
      } catch (InterruptedException var3) {
         throw new t9();
      }

      return !this.n5.isAlive();
   }

   public static void l6(int var0) {
      if (var0 < -1) {
         throw new ArgumentOutOfRangeException("timeout");
      }

      try {
         n5().h0 |= 32;
         if (var0 == -1) {
            Thread.sleep(Long.MAX_VALUE);
         } else {
            Thread.sleep(var0);
         }

         n5().h0 ^= 32;
      } catch (SecurityException var2) {
         throw new com.aspose.slides.exceptions.SecurityException(var2.getMessage());
      } catch (InterruptedException var3) {
         throw new t9(var3.getMessage());
      }
   }

   public void a6() {
      try {
         if (!this.s7) {
            if (this.n5.isAlive()) {
               throw new m3();
            }

            this.n5.checkAccess();
            this.n5.start();
            this.h0 = 0;
         } else {
            throw new m3("Thread was aborted");
         }
      } catch (IllegalThreadStateException var2) {
         throw new m3(var2.getMessage());
      }
   }

   public void n5(Object var1) {
      if (this.e2 instanceof m1) {
         throw new InvalidOperationException("The thread was created with a ThreadStart delegate that does not accept a parameter.");
      }

      this.t2 = var1;

      try {
         if (!this.s7) {
            if (this.n5.isAlive()) {
               throw new m3();
            }

            this.n5.checkAccess();
            this.n5.start();
            this.h0 = 0;
         }
      } catch (IllegalThreadStateException var3) {
         throw new m3(var3.getMessage());
      }
   }

   public void n5(com.aspose.slides.internal.x7n.l6 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      if (var1.h0()) {
         throw new NotSupportedException(
            "Neutral cultures cannot be used in formatting and parsing and therefore cannot be set as the thread's current culture"
         );
      }

      this.l6 = var1;
      Locale.setDefault(com.aspose.slides.internal.x7n.l6.n5(var1));
   }

   public com.aspose.slides.internal.x7n.l6 u9() {
      if (this.l6 == null || !j8.n5(com.aspose.slides.internal.x7n.l6.n5(this.l6), com.aspose.slides.ms.System.y2.n5())) {
         this.l6 = com.aspose.slides.internal.x7n.l6.n5(com.aspose.slides.ms.System.y2.n5());
      }

      return this.l6;
   }

   public void l6(com.aspose.slides.internal.x7n.l6 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      this.k5 = var1;
   }

   public com.aspose.slides.internal.x7n.l6 h0() {
      if (this.k5 == null) {
         this.k5 = com.aspose.slides.internal.x7n.l6.u3();
      }

      return this.k5;
   }

   public long c8() {
      return this.n5.getId();
   }

   public void n5(String var1) {
      if (this.a6) {
         throw new InvalidOperationException("This property has already been set and cannot be modified.");
      }

      if (var1 != null) {
         this.n5.setName(var1);
      }

      this.u9 = var1;
      this.a6 = true;
   }

   public int t2() {
      if (!this.n5.isAlive()) {
         if (this.n5.isInterrupted()) {
            return 16;
         }

         if ((this.h0 & 8) != 8) {
            return 16;
         }
      }

      return this.h0;
   }

   // $VF: synthetic method
   static Object n5(t2 var0) {
      return var0.t2;
   }
}
