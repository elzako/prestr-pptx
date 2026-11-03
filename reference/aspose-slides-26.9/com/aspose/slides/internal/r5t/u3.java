package com.aspose.slides.internal.r5t;

import com.aspose.slides.exceptions.ArgumentNullException;
import java.util.Hashtable;
import java.util.concurrent.locks.ReentrantLock;

public class u3 {
   private static final Hashtable<Object, u3$n5> n5 = new Hashtable<>(20);

   public static void n5(Object var0) {
      if (var0 == null) {
         throw new ArgumentNullException("obj");
      }

      try {
         synchronized (n5) {
            if (n5.containsKey(var0)) {
               ReentrantLock var2 = n5.get(var0).n5();
               var2.lock();
            } else {
               ReentrantLock var6 = new ReentrantLock();
               var6.lock();
               n5.put(var0, new u3$n5(var6, null));
            }
         }
      } catch (IllegalMonitorStateException var5) {
         n5();
      }
   }

   public static void l6(Object var0) {
      if (var0 == null) {
         throw new ArgumentNullException("obj");
      }

      try {
         synchronized (n5) {
            if (n5.containsKey(var0)) {
               ReentrantLock var2 = n5.get(var0).n5();
               if (var2.isHeldByCurrentThread()) {
                  var2.unlock();
                  if (!var2.hasQueuedThreads() && !var2.isLocked()) {
                     n5.remove(var0);
                  }
               } else {
                  n5();
               }
            } else {
               n5();
            }
         }
      } catch (IllegalMonitorStateException var5) {
         n5();
      }
   }

   private static void n5() {
      throw new c8("Object synchronization method was called from an unsynchronized block of code.");
   }
}
