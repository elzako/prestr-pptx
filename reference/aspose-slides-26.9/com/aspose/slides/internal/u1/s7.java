package com.aspose.slides.internal.u1;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class s7 extends t2 {
   private Dictionary<Integer, Float> a6 = new Dictionary<>();

   public s7() {
      this.n5();
      this.n5.l6(com.aspose.slides.internal.v2.c8.u7f, com.aspose.slides.internal.v2.c8.o6t);
   }

   public s7(com.aspose.slides.internal.v2.k5 var1) {
      super(var1);
      this.n5();
      this.j5();
   }

   private void n5() {
      com.aspose.slides.internal.x2.k5 var1 = null;
      com.aspose.slides.internal.v2.s7 var2 = this.n5.n3(com.aspose.slides.internal.v2.c8.e0);
      com.aspose.slides.internal.v2.s7 var3 = this.l6(var2);
      if (var3 == null) {
         this.n5((com.aspose.slides.internal.v2.c8)null);
         var1 = this.y4();
         if (var1 != null) {
            IGenericDictionary var4 = var1.u3();
            IGenericEnumerator var5 = var4.iterator();

            try {
               while (var5.hasNext()) {
                  KeyValuePair var6 = (KeyValuePair)var5.next();
                  this.c8().n5((Integer)var6.getKey(), (Integer)var6.getValue());
                  this.s7().n5((Integer)var6.getValue(), (Integer)var6.getKey());
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
                  var5.dispose();
               }
            }
         }
      } else if (com.aspose.slides.internal.v6g.k5.l6(var3, com.aspose.slides.internal.v2.c8.class)) {
         this.n5((com.aspose.slides.internal.v2.c8)var3);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var3, com.aspose.slides.internal.v2.k5.class)) {
         com.aspose.slides.internal.v2.k5 var12 = (com.aspose.slides.internal.v2.k5)var3;
         com.aspose.slides.internal.v2.s7 var13 = var12.n3(com.aspose.slides.internal.v2.c8.c4);
         var3 = this.l6(var13);
         if (var3 == null) {
            this.n5((com.aspose.slides.internal.v2.c8)null);
         } else {
            this.n5((com.aspose.slides.internal.v2.c8)var3);
         }

         this.n5(var12, var1);
      }

      this.m3();
   }

   private void j5() {
      if (this.t4() == null) {
         u9 var1 = new u9();
         this.n5(var1);
      }
   }

   @Override
   public String k5(byte[] var1, int var2, int var3) {
      a5 var4 = new a5();
      String var5 = d1.n5;
      if (d1.n5(var5)) {
         for (int var6 = var2; var6 < var2 + var3; var6++) {
            String var7 = this.u9(var1, var6, 1);
            if (var7 == null && var6 < var2 + var3 - 1) {
               var7 = this.u9(var1, var6, 2);
               var6++;
            }

            if (var7 != null) {
               var4.n5(var7);
            }
         }

         var5 = var4.toString();
      }

      return var5;
   }

   @Override
   public float n5(int var1) {
      float var2 = super.n5(var1);
      if (var2 <= 0.0F) {
         if (this.a6.containsKey(var1)) {
            var2 = this.a6.get_Item(var1);
         } else {
            var2 = 250.0F;
            this.a6.addItem(var1, var2);
         }
      }

      return var2;
   }
}
