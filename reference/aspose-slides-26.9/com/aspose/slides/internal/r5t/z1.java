package com.aspose.slides.internal.r5t;

import com.aspose.slides.Collections.Generic.List;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class z1 {
   private static int n5 = 500;
   private static int l6 = 2;
   private static int k5 = 1000;
   private static int u3 = 2;
   private static ThreadPoolExecutor a6;
   private static y1 u9 = new y1(l6);
   private static List<Future<?>> h0 = new List<>();
   private static AtomicBoolean c8 = new AtomicBoolean(false);
   private static final Object t2 = new Object();

   private static ThreadPoolExecutor a6() {
      if (a6 == null) {
         a6 = new ThreadPoolExecutor(n5, n5, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());
      }

      return a6;
   }

   public static boolean n5(r4 var0) {
      return n5(var0, null);
   }

   public static boolean n5(r4 var0, Object var1) {
      synchronized (t2) {
         Future var3 = a6().submit(new t4(var0, var1));
         h0.add(var3);
      }

      u9();
      return true;
   }

   public static boolean n5(int var0, int var1) {
      l6 = var0;
      u9.setCorePoolSize(var0);
      return true;
   }

   private static void u9() {
      if (!c8.get()) {
         c8.set(true);
         new t2(new q0()).a6();
      }
   }

   // $VF: synthetic method
   static List n5() {
      return h0;
   }

   // $VF: synthetic method
   static Object l6() {
      return t2;
   }

   // $VF: synthetic method
   static ThreadPoolExecutor k5() {
      return a6;
   }

   // $VF: synthetic method
   static ThreadPoolExecutor n5(ThreadPoolExecutor var0) {
      a6 = var0;
      return var0;
   }

   // $VF: synthetic method
   static AtomicBoolean u3() {
      return c8;
   }
}
