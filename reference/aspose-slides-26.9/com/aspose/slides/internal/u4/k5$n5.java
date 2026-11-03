package com.aspose.slides.internal.u4;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.internal.k5.u3;
import com.aspose.slides.internal.k5.u9;
import com.aspose.slides.internal.z5.a6;
import com.aspose.slides.internal.z5.h0;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.n1;

class k5$n5 {
   private final Dictionary<Integer, Dictionary<Integer, a6>> n5 = new Dictionary<>();
   private final h0 l6;
   private int k5;

   public final boolean n5() {
      return this.k5 > 0;
   }

   public final boolean l6() {
      if (!this.n5()) {
         return true;
      }

      Dictionary$Enumerator var1 = this.n5.get_Item(6).iterator();

      try {
         while (var1.hasNext()) {
            KeyValuePair var2 = (KeyValuePair)var1.next();
            if (!this.n5((a6)var2.getValue(), this.n5.get_Item(7).get_Item((Integer)var2.getKey()))
               || !this.n5((a6)var2.getValue(), this.n5.get_Item(8).get_Item((Integer)var2.getKey()))) {
               return false;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      return true;
   }

   public final boolean k5() {
      if (this.l6()) {
         return true;
      }

      Dictionary$Enumerator var1 = this.n5.get_Item(7).iterator();

      try {
         while (var1.hasNext()) {
            KeyValuePair var2 = (KeyValuePair)var1.next();
            if (!this.n5((a6)var2.getValue(), this.n5.get_Item(8).get_Item((Integer)var2.getKey()))) {
               return false;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      return true;
   }

   public k5$n5() {
      this.n5.addItem(6, u3());
      this.n5.addItem(7, u3());
      this.n5.addItem(8, u3());
      this.l6 = new h0();
   }

   public final void n5(int var1, int var2, u9 var3, com.aspose.slides.internal.z5.u9 var4) {
      a6 var5 = this.n5(var2, var3, var4);
      if (var5 != null) {
         if (this.n5.get_Item(var1).get_Item(var2) == null) {
            this.n5.get_Item(var1).set_Item(var2, var5);
         } else {
            this.n5.get_Item(var1).get_Item(var2).n5(this.n5.get_Item(var1).get_Item(var2).l6() + var5.l6());
         }

         this.k5++;
      }
   }

   public final Dictionary<Integer, a6> n5(int var1) {
      return this.n5.get_Item(var1);
   }

   public final boolean l6(int var1) {
      return this.n5.get_Item(var1).get_Item(163) != null
         || this.n5.get_Item(var1).get_Item(164) != null
         || this.n5.get_Item(var1).get_Item(165) != null
         || this.n5.get_Item(var1).get_Item(166) != null;
   }

   private static Dictionary<Integer, a6> u3() {
      Dictionary var0 = new Dictionary();
      var0.addItem(163, null);
      var0.addItem(164, null);
      var0.addItem(165, null);
      var0.addItem(166, null);
      return var0;
   }

   private a6 n5(int var1, u9 var2, com.aspose.slides.internal.z5.u9 var3) {
      u3 var4 = com.aspose.slides.internal.v6g.k5.n5(var2, u3.class);
      if (var4 == null) {
         return null;
      }

      a6 var7;
      if (var4.n5() == 2) {
         float var5 = var4.n5((short)3);
         float var6 = var1 != 164 && var1 != 165 ? var3.n5().l6().l6() * var5 / 100.0F : var3.n5().n5().l6() * var5 / 100.0F;
         var7 = new a6(var6, var3.n5().n5().n5());
      } else {
         int var8 = this.n5(var4.n5());
         var7 = new a6(var4.n5(var4.n5()), var8);
      }

      return this.l6.n5(var7);
   }

   private boolean n5(a6 var1, a6 var2) {
      if (var1 == null && var2 == null) {
         return true;
      } else {
         return (var1 == null || var2 != null) && var1 != null ? var1.n5() == var2.n5() && n1.l6(var1.l6(), var2.l6()) : false;
      }
   }

   private int n5(short var1) {
      switch (var1) {
         case 5:
            return 0;
         case 6:
            return 1;
         case 7:
            return 2;
         case 8:
            return 3;
         case 9:
            return 4;
         default:
            return 0;
      }
   }
}
