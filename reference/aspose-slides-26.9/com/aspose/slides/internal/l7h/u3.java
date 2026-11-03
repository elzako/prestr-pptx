package com.aspose.slides.internal.l7h;

import com.aspose.slides.Collections.Generic.Dictionary;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class u3 extends c4 {
   private static final c4 n5 = new u3();
   private Dictionary<Integer, j5> l6 = new Dictionary<>();
   private ReentrantReadWriteLock k5 = new ReentrantReadWriteLock();

   public static c4 n5() {
      return n5;
   }

   @Override
   public j5 n5(int var1) {
      if (var1 < 0 || var1 > 65535) {
         return null;
      }

      if (var1 == 0) {
         int var20 = l6();
         return var20 != 0 ? this.n5(var20) : null;
      }

      j5 var2 = null;
      this.k5.readLock().lock();

      try {
         j5[] var3 = new j5[]{var2};
         boolean var4 = this.l6.tryGetValue(var1, var3);
         var2 = var3[0];
         if (var4) {
            return var2;
         }

         int var5 = com.aspose.slides.internal.l7h.l6.k5(var1);
         if (var5 == 1) {
            var2 = new b3(var1);
         } else if (var5 == 2) {
            var2 = new a6(var1);
         } else {
            var2 = k5(var1);
            if (var2 == null) {
               return null;
            }
         }

         this.k5.readLock().unlock();
         this.k5.writeLock().lock();

         try {
            j5 var6 = null;
            j5[] var7 = new j5[]{var6};
            boolean var8 = this.l6.tryGetValue(var1, var7);
            var6 = var7[0];
            if (var8) {
               return var6;
            }

            this.l6.addItem(var1, var2);
         } finally {
            this.k5.readLock().lock();
            this.k5.writeLock().unlock();
         }
      } finally {
         this.k5.readLock().unlock();
      }

      return var2;
   }

   @Override
   public j5 n5(String var1) {
      int var2 = y1.l6(var1);
      return var2 == 0 ? null : this.n5(var2);
   }

   private static j5 k5(int var0) {
      r4 var1 = null;
      switch (var0) {
         case 10003:
            var1 = new a6(10003, 20949);
            break;
         case 10008:
            var1 = new a6(10008, 20936);
            break;
         case 38598:
            var1 = new b3(var0, 28598);
            break;
         case 50220:
         case 50221:
         case 50222:
         case 50225:
         case 52936:
            var1 = new d5(var0);
            break;
         case 50227:
         case 51936:
            var1 = new a6(var0, 936);
            break;
         case 51932:
            var1 = new e2();
            break;
         case 51949:
            var1 = new a6(var0, 20949);
            break;
         case 54936:
            var1 = new a0();
            break;
         case 57002:
         case 57003:
         case 57004:
         case 57005:
         case 57006:
         case 57007:
         case 57008:
         case 57009:
         case 57010:
         case 57011:
            var1 = new d2(var0);
      }

      return var1;
   }

   private static int l6() {
      return 0;
   }
}
