package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.IDisposable;

class h2 {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9("by-letter", "by-word");

   public static Effect n5(Sequence var0, com.aspose.slides.internal.k4y.g4z var1, l4h var2) {
      if (var0 == null) {
         throw new ArgumentNullException("sequence");
      }

      if (var1 == null) {
         throw new ArgumentNullException("parElement");
      }

      if (var1.u3() == 0) {
         throw new InvalidOperationException();
      }

      Effect var3 = new Effect(var0);
      n5(var3, var1.s7(), var1.u3(), var1.l6(), var1.k5());
      var0.n5().u3().addItem(var3);
      n5(var3, var1.n3(), var2);
      n5(var3, var1);
      n5(var3, var1.n5());
      int var4 = 0;
      int[] var5 = new int[]{0};
      boolean var6 = t2f.k5(var1.a6()) && com.aspose.slides.ms.System.a3.n5(var1.a6(), var5);
      var4 = var5[0];
      if (var6) {
         var3.k5().n5(var4);
      }

      return var3;
   }

   public static Effect n5(Sequence var0, com.aspose.slides.internal.k4y.p8u var1, l4h var2) {
      if (var0 == null) {
         throw new ArgumentNullException("sequence");
      }

      if (var1 == null) {
         throw new ArgumentNullException("parElement");
      }

      if (var1.u3() == 0) {
         throw new InvalidOperationException();
      }

      Effect var3 = new Effect(var0);
      n5(var3, var1.s7(), var1.u3(), var1.l6(), var1.k5());
      if (t2f.k5(var1.t2())) {
         var3.getTiming().setTriggerDelayTime(d1k.n5(var1.t2()));
      }

      if (t2f.k5(var1.h0())) {
         var3.setAnimateTextType(n5(var1.h0()));
         var3.setDelayBetweenTextParts(-((float)var1.c8().h0()) / 1000.0F);
      }

      if (var3.k5().u3() == null) {
         a5.n5(var3, var1.u9(), var2);
      }

      var0.n5().u3().addItem(var3);
      n5(var3, var1.x8(), var2);
      n5(var3, var1.n5());
      int var4 = 0;
      int[] var5 = new int[]{0};
      boolean var6 = t2f.k5(var1.a6()) && com.aspose.slides.ms.System.a3.n5(var1.a6(), var5);
      var4 = var5[0];
      if (var6) {
         var3.k5().n5(var4);
      }

      return var3;
   }

   private static void n5(Effect var0, int var1, int var2, String var3, String var4) {
      ((Timing)var0.getTiming()).n5(l6(var1));
      var0.k5().n5(k5(var2));
      n5(var0, var0.k5().s7());
      if (t2f.k5(var3) && a3.l6().containsKey(var3)) {
         y0 var5 = a3.l6().get_Item(var3);
         var0.k5().u3(z9u.n5((long)var5.n5(), var0.k5().s7()));
      } else {
         var0.k5().u3(127);
      }

      if (t2f.k5(var4)) {
         int var8 = 0;
         if (a3.n5().containsKey(var4)) {
            j9 var6 = a3.n5().get_Item(var4);
            var0.k5().a6(z9u.l6(var0.k5().s7(), var0.k5().e2(), var6.n5()));
         } else {
            int[] var10 = new int[]{0};
            boolean var7 = com.aspose.slides.ms.System.a3.n5(var4, var10) && var10[0] > 0;
            var8 = var10[0];
            if (var7) {
               var0.k5().a6(z9u.n5(var0.k5().s7(), var0.k5().e2(), var8 - 1L));
            }
         }
      } else {
         var0.k5().a6(0);
      }
   }

   public static int n5(int var0) {
      switch (var0) {
         case 0:
            return -1;
         case 1:
            return 2;
         case 2:
            return 0;
         case 3:
            return 1;
         case 4:
            return -1;
         default:
            throw new ArgumentOutOfRangeException("value", com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.k4y.h6g.class, var0));
      }
   }

   public static int l6(int var0) {
      switch (var0) {
         case 0:
            return -1;
         case 1:
            return 0;
         case 2:
            return 1;
         case 3:
            return 2;
         case 4:
            return -1;
         case 5:
            return -1;
         case 6:
            return 3;
         default:
            throw new ArgumentOutOfRangeException("value", com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.k4y.v4t.class, var0));
      }
   }

   private static byte k5(int var0) {
      switch (var0) {
         case 0:
            return -1;
         case 1:
            return -1;
         case 2:
            return 0;
         case 3:
            return 1;
         case 4:
            return 2;
         case 5:
            return 3;
         case 6:
            return 4;
         case 7:
            return 5;
         default:
            throw new ArgumentOutOfRangeException("presetClass", com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.k4y.p9i.class, var0));
      }
   }

   private static int n5(String var0) {
      switch (n5.n5(var0)) {
         case 0:
            return 2;
         case 1:
            return 1;
         default:
            return 0;
      }
   }

   private static void n5(Effect var0, byte var1) {
      switch (var1) {
         case 0:
            var0.k5().k5(0);
            break;
         case 1:
            var0.k5().k5(1);
            break;
         case 2:
            var0.k5().k5(2);
            break;
         case 3:
            var0.k5().k5(3);
            break;
         case 4:
            var0.k5().k5(5);
            break;
         case 5:
            var0.k5().k5(4);
      }
   }

   private static void n5(Effect var0, List<com.aspose.slides.internal.k4y.g7> var1, l4h var2) {
      List$Enumerator var3 = var1.iterator();

      try {
         while (var3.hasNext()) {
            com.aspose.slides.internal.k4y.g7 var4 = (com.aspose.slides.internal.k4y.g7)var3.next();
            t1.n5(var0, var4, var2);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   private static void n5(Effect var0, com.aspose.slides.internal.k4y.g4z var1) {
      var0.getTiming().setAutoReverse(var1.x8());
      var0.getTiming().setRestart(n5(var1.t2()));
      if (t2f.k5(var1.c8())) {
         var0.getTiming().setRepeatCount(d1k.l6(var1.c8()));
      }

      if (t2f.k5(var1.h0())) {
         var0.getTiming().setRepeatDuration(d1k.n5(var1.h0()));
      }

      if (t2f.k5(var1.u9())) {
         var0.getTiming().setTriggerDelayTime(d1k.n5(var1.u9()));
      }
   }

   private static void n5(Effect var0, int var1) {
      switch (var1) {
         case 0:
         case 5:
         case 6:
         case 7:
         default:
            throw new ArgumentOutOfRangeException(
               com.aspose.slides.ms.System.d1.n5(
                  "{0} is not expected", new Object[]{com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.k4y.z6b.class, var1, "F")}
               )
            );
         case 1:
            var0.getTiming().setTriggerType(0);
            break;
         case 2:
            var0.getTiming().setTriggerType(1);
            break;
         case 3:
            var0.getTiming().setTriggerType(2);
            break;
         case 4:
            var0.getTiming().setTriggerType(0);
      }
   }
}
