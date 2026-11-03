package com.aspose.slides.internal.h0;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$ValueCollection$Enumerator;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class a6 implements m3 {
   private Dictionary<String, a6$n5> n5;
   private com.aspose.slides.internal.j3.z3 l6;
   private a6 k5;

   public a6(com.aspose.slides.internal.j3.z3 var1) {
      this.l6 = var1;
      this.k5 = n5(var1);
      this.l6();
   }

   private static a6 n5(com.aspose.slides.internal.j3.z3 var0) {
      for (com.aspose.slides.internal.j3.z8 var1 = var0.z3(); var1 != null; var1 = var1.v4()) {
         com.aspose.slides.internal.k5.k7 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.k5.k7.class);
         if (var2 != null) {
            return (a6)var2.l6();
         }
      }

      if (var0.a5() != null && var0.a5().n3() == 1) {
         var0 = com.aspose.slides.internal.v6g.k5.n5(var0.a5(), com.aspose.slides.internal.j3.z3.class);
         com.aspose.slides.internal.k5.k7 var4 = com.aspose.slides.internal.v6g.k5.n5(var0, com.aspose.slides.internal.k5.k7.class);
         return var4 != null ? (a6)var4.l6() : n5(var0);
      } else {
         return null;
      }
   }

   public final com.aspose.slides.internal.j3.z3 n5() {
      return this.l6;
   }

   private void l6() {
      this.n5 = new Dictionary<>();
      if (this.k5 != null) {
         Dictionary$ValueCollection$Enumerator var1 = this.k5.n5.getValues().iterator();

         try {
            while (var1.hasNext()) {
               a6$n5 var2 = (a6$n5)var1.next();
               this.n5.addItem(var2.l6(), var2.n5(this));
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
               var1.dispose();
            }
         }
      }
   }

   public final boolean n5(String var1, int[] var2) {
      if (this.n5.containsKey(var1)) {
         var2[0] = this.n5.get_Item(var1).k5();
         return true;
      } else {
         var2[0] = 0;
         return false;
      }
   }

   @Override
   public final int n5(String var1, String var2) {
      var1 = d1.a6(var1);
      if ("before".equals(var2)) {
         if (this.n5.containsKey(var1)) {
            return this.n5.get_Item(var1).u3();
         }
      } else if ("after".equals(var2) && this.n5.containsKey(var1)) {
         return this.n5.get_Item(var1).a6();
      }

      return 0;
   }

   @Override
   public final void l6(String var1, String var2) {
      this.n5(var1, 1, var2);
   }

   @Override
   public final void n5(String var1, int var2, String var3) {
      var1 = d1.a6(var1);
      if (this.n5.containsKey(var1)) {
         this.n5.get_Item(var1).n5(var2, var3);
      } else {
         this.n5.addItem(var1, new a6$n5(var1, var2, this));
      }
   }

   @Override
   public final void k5(String var1, String var2) {
      this.l6(var1, 0, var2);
   }

   @Override
   public final void l6(String var1, int var2, String var3) {
      var1 = d1.a6(var1);
      if (this.n5.containsKey(var1)) {
         this.n5.get_Item(var1).l6(var2, var3);
      } else {
         this.n5.addItem(var1, new a6$n5(var1, var2, this));
      }
   }

   public final a6 n5(String var1) {
      return this.n5.containsKey(var1) ? this.n5.get_Item(var1).n5() : this;
   }
}
