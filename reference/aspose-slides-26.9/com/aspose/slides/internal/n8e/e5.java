package com.aspose.slides.internal.n8e;

import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class e5 {
   private static e5 u9 = new e5();
   private double h0 = 0.0;
   private long c8 = 0L;
   private Lock t2 = new ReentrantLock();
   private Lock s7 = new ReentrantLock();
   private long x8 = 0L;
   private Lock n3 = new ReentrantLock();
   private final double y4 = 100.0;
   private final long e2 = 30L;
   private final long t9 = 5000L;
   private final long z1 = 43200000L;
   long n5 = -1L;
   int l6 = 0;
   Lock k5 = new ReentrantLock();
   long u3 = -1L;
   Lock a6 = new ReentrantLock();

   private e5() {
   }

   public static e5 n5() {
      return u9;
   }

   private long u3() {
      long var1 = 0L;
      this.n3.lock();

      try {
         var1 = this.x8;
      } finally {
         this.n3.unlock();
      }

      return var1;
   }

   private void l6(long var1) {
      this.n3.lock();

      try {
         this.x8 = var1;
      } finally {
         this.n3.unlock();
      }
   }

   public void n5(double var1) {
      this.n5(var1, true);
   }

   void n5(double var1, boolean var3) {
      if (!Arrays.equals(f2.l6(), z7.n5)) {
         double var4 = 0.0;
         this.s7.lock();

         try {
            this.h0 += var1;
            var4 = this.h0;
         } finally {
            this.s7.unlock();
         }

         if (var3) {
            boolean var6 = false;
            long var7 = System.currentTimeMillis() - this.u3();
            if (var7 > 43200000L || var7 > 5000L && var4 > 100.0) {
               var6 = true;
            }

            if (var6) {
               new e5$n5(this, null).start();
               this.l6(System.currentTimeMillis());
            }
         }
      }
   }

   public void n5(long var1) {
      this.n5(var1, true);
   }

   void n5(long var1, boolean var3) {
      if (f2.l6() != z7.n5) {
         long var4 = 0L;
         this.t2.lock();

         try {
            this.c8 += var1;
            var4 = this.c8;
         } finally {
            this.t2.unlock();
         }

         if (var3) {
            boolean var6 = false;
            long var7 = System.currentTimeMillis() - this.u3();
            if (var7 > 43200000L || var7 > 5000L && var4 > 30L) {
               var6 = true;
            }

            if (var6) {
               new e5$n5(this, null).start();
               this.l6(System.currentTimeMillis());
            }
         }
      }
   }

   double l6() {
      double var1 = 0.0;
      this.s7.lock();

      try {
         var1 = this.h0;
         this.h0 = 0.0;
      } finally {
         this.s7.unlock();
      }

      return var1;
   }

   long k5() {
      long var1 = 0L;
      this.t2.lock();

      try {
         var1 = this.c8;
         this.c8 = 0L;
      } finally {
         this.t2.unlock();
      }

      return var1;
   }
}
