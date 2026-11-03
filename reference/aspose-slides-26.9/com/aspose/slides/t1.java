package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

class t1 {
   private static final Dictionary<String, t1$n5> n5 = new Dictionary<>();

   public static void n5(Effect var0, com.aspose.slides.internal.k4y.g7 var1, l4h var2) {
      if (var0 == null) {
         throw new ArgumentNullException("effect");
      }

      if (var1 == null) {
         throw new ArgumentNullException("namedObject");
      }

      if (n5.containsKey(var1.n5())) {
         y3e var3 = n5.get_Item(var1.n5()).n5(var0, var1, var2);
         ((Behavior)var3.q0()).n5().n5(var0);
         var0.getBehaviors().add(var3.q0());
         n5(var3);
         if (var0.k5().u3() == null) {
            a5.n5(var0, var3.n5(), var2);
         }
      }
   }

   public static byte n5(int var0) {
      switch (var0) {
         case 0:
            return -1;
         case 1:
            return 0;
         case 2:
            return 1;
         default:
            throw new ArgumentOutOfRangeException("value", com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.k4y.l1h.class, var0));
      }
   }

   public static int l6(int var0) {
      switch (var0) {
         case 0:
            return -1;
         case 1:
            return 3;
         case 2:
            return 2;
         default:
            throw new ArgumentOutOfRangeException("value", com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.k4y.c1b.class, var0));
      }
   }

   private static void n5(y3e var0) {
      IBehavior var1 = var0.q0();
      Timing var2 = (Timing)var1.getTiming();
      float var3 = d1k.n5(var0.h0());
      var2.n5(var3 >= 0.001F ? d1k.n5(var0.h0()) : 0.0F);
      if (t2f.k5(var0.u9())) {
         var2.setTriggerDelayTime(d1k.n5(var0.u9()));
      }

      var2.setAccelerate((float)var0.n3());
      var2.setDecelerate((float)var0.y4());
      var2.setAutoReverse(var0.e2());
      var2.setRepeatCount(d1k.l6(var0.t2(), 1.0F));
      var2.setRepeatDuration(d1k.n5(var0.c8(), Float.NaN));
      var2.setRestart(h2.n5(var0.s7()));
      var2.n5(h2.l6(var0.x8()));
      var1.setAdditive(l6(var0.z1()));
      var1.setAccumulate(n5(var0.t9()));
   }

   private static y3e u9(Effect var0, com.aspose.slides.internal.k4y.g7 var1, l4h var2) {
      ISetEffect var3 = ((Sequence)var0.getSequence()).n5().s7().createSetEffect();
      y3e var4 = new y3e((com.aspose.slides.internal.k4y.y2d)var1.l6(), var3);
      u6.n5(var3, var4, var2);
      return var4;
   }

   private static y3e h0(Effect var0, com.aspose.slides.internal.k4y.g7 var1, l4h var2) {
      IColorEffect var3 = ((Sequence)var0.getSequence()).n5().s7().createColorEffect();
      return new y3e((com.aspose.slides.internal.k4y.z8y)var1.l6(), var3);
   }

   private static y3e c8(Effect var0, com.aspose.slides.internal.k4y.g7 var1, l4h var2) {
      com.aspose.slides.internal.k4y.r2z var3 = (com.aspose.slides.internal.k4y.r2z)var1.l6();
      IPropertyEffect var4 = ((Sequence)var0.getSequence()).n5().s7().createPropertyEffect();
      y3e var5 = new y3e(var3, var4);
      u6.n5(var4, var5, var2);
      u6.n5(var4, var3, var2);
      return var5;
   }

   private static y3e t2(Effect var0, com.aspose.slides.internal.k4y.g7 var1, l4h var2) {
      com.aspose.slides.internal.k4y.r3k var3 = (com.aspose.slides.internal.k4y.r3k)var1.l6();
      IFilterEffect var4 = ((Sequence)var0.getSequence()).n5().s7().createFilterEffect();
      y3e var5 = new y3e(var3, var4);
      u6.n5(var4, var5, var2);
      return var5;
   }

   // $VF: synthetic method
   static y3e l6(Effect var0, com.aspose.slides.internal.k4y.g7 var1, l4h var2) {
      return u9(var0, var1, var2);
   }

   // $VF: synthetic method
   static y3e k5(Effect var0, com.aspose.slides.internal.k4y.g7 var1, l4h var2) {
      return h0(var0, var1, var2);
   }

   // $VF: synthetic method
   static y3e u3(Effect var0, com.aspose.slides.internal.k4y.g7 var1, l4h var2) {
      return c8(var0, var1, var2);
   }

   // $VF: synthetic method
   static y3e a6(Effect var0, com.aspose.slides.internal.k4y.g7 var1, l4h var2) {
      return t2(var0, var1, var2);
   }

   static {
      n5.set_Item("set", new t1$1());
      n5.set_Item("animateColor", new t1$2());
      n5.set_Item("animate", new t1$3());
      n5.set_Item("transitionFilter", new t1$4());
   }
}
