package com.aspose.slides.internal.f5;

import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class k7 extends c4 implements IDisposable {
   private r4 n5;
   private com.aspose.slides.internal.r8.k5 l6;

   protected k7() {
   }

   public static k7 n5(r4 var0) {
      k7 var1 = new k7();
      var1.n5 = var0;
      var1.l6 = null;
      return var1;
   }

   public static k7 n5(r4 var0, String var1) {
      k7 var2 = new k7();
      var2.n5 = var0;
      var2.l6 = com.aspose.slides.internal.r8.k5.n5(d1.t2(var1), var0.y4().k5().n5("*"));
      return var2;
   }

   public static k7 n5(r4 var0, IGenericEnumerable<String> var1) {
      k7 var2 = new k7();
      var2.n5 = var0;
      var2.l6 = com.aspose.slides.internal.r8.k5.n5(var1, var0.y4().k5().n5("*"));
      return var2;
   }

   public static k7 n5(r4 var0, IGenericDictionary<String, IGenericEnumerable<KeyValuePair<String, String>>> var1, int var2) {
      k7 var3 = new k7();
      var3.n5 = var0;
      var3.l6 = com.aspose.slides.internal.r8.n5.n5(var1, var2, var0.y4().k5().n5("*"));
      return var3;
   }

   public static k7 n5(r4 var0, String var1, String var2) {
      k7 var3 = new k7();
      var3.n5 = var0;
      var3.l6 = com.aspose.slides.internal.r8.k5.n5(var1, var2, var0.y4().k5().n5("*"));
      return var3;
   }

   @Override
   public com.aspose.slides.internal.j3.z8 n5(int var1) {
      if (var1 >= 0 && var1 <= this.n5()) {
         com.aspose.slides.internal.d1.a6 var2 = this.n5.y4().l6(this.n5, 1, this.l6, false);

         try {
            while (true) {
               com.aspose.slides.internal.j3.z8 var3 = var2.a6();
               if (var1 == 0) {
                  return var3;
               }

               var1--;
            }
         } finally {
            if (var2 != null) {
               var2.dispose();
            }
         }
      } else {
         return null;
      }
   }

   @Override
   public int n5() {
      int var1 = 0;
      com.aspose.slides.internal.d1.a6 var2 = this.n5.y4().l6(this.n5, 1, this.l6, false);

      try {
         while (true) {
            com.aspose.slides.internal.j3.z8 var3 = var2.a6();
            if (var3 == null) {
               return var1;
            }

            var1++;
         }
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   @Override
   public IGenericEnumerator<com.aspose.slides.internal.j3.z8> iterator() {
      com.aspose.slides.internal.d1.a6 var1 = this.n5.y4().l6(this.n5, 1, this.l6, false);
      return new m1(var1);
   }

   @Override
   public final void dispose() {
      this.n5 = null;
      this.l6 = null;
   }
}
