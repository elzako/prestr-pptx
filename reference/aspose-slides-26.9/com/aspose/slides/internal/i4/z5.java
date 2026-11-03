package com.aspose.slides.internal.i4;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.ms.System.IDisposable;
import java.util.Iterator;

public class z5 extends u6 {
   private j9 u3;

   public final g7 n5(y1 var1, g7[] var2) {
      return this.u3.c4().u9(var1.toString());
   }

   public static g7 n5(s9 var0, g7[] var1) {
      return var0.n5("lastIndex");
   }

   public final g7 l6(s9 var1, g7[] var2) {
      u3 var3 = this.u3.e2().h0();
      String var4 = var2[0].toString();
      var3.n5("input", this.u3.c4().u9(var4));
      int var5 = 0;
      com.aspose.slides.internal.r7c.u9 var6 = com.aspose.slides.internal.r7c.c8.l6(var4, var1.y4(), var1.t9());
      if (var6.n5() > 0) {
         if (var1.s7()) {
            Iterator var17 = var6.iterator();

            try {
               while (var17.hasNext()) {
                  com.aspose.slides.internal.r7c.u3 var18 = (com.aspose.slides.internal.r7c.u3)var17.next();
                  var3.n5(this.u3.w1().n5((double)(var5++)), this.u3.c4().u9(var18.k5()));
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var17, IDisposable.class)) {
                  ((IDisposable)var17).dispose();
               }
            }
         } else {
            IEnumerator var7 = var6.n5(0).a6().iterator();

            try {
               while (var7.hasNext()) {
                  com.aspose.slides.internal.r7c.l6 var8 = (com.aspose.slides.internal.r7c.l6)var7.next();
                  var3.n5(this.u3.w1().n5((double)(var5++)), this.u3.c4().u9(var8.k5()));
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
                  ((IDisposable)var7).dispose();
               }
            }
         }

         var3.n5("index", this.u3.w1().n5((double)(var6.n5(0).n5())));
      }

      return var3;
   }

   public final g7 k5(s9 var1, g7[] var2) {
      return this.u3.t9().n5(this.l6(var1, var2) != y5.n5);
   }

   @Override
   public g7 n5(w2 var1, y1 var2, g7[] var3) {
      g7 var4;
      if ("toString".equals(this.n5)) {
         var4 = this.n5(var2, var3);
      } else if ("toLocaleString".equals(this.n5)) {
         var4 = this.n5(var2, var3);
      } else if ("lastIndex".equals(this.n5)) {
         var4 = n5(com.aspose.slides.internal.v6g.k5.n5(var2, s9.class), var3);
      } else if ("exec".equals(this.n5)) {
         var4 = this.l6(com.aspose.slides.internal.v6g.k5.n5(var2, s9.class), var3);
      } else {
         if (!"test".equals(this.n5)) {
            throw new j3("unknown error function");
         }

         var4 = this.k5(com.aspose.slides.internal.v6g.k5.n5(var2, s9.class), var3);
      }

      var1.l6(var4);
      return var4;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5("function {0}", new Object[]{this.n3()});
   }

   public z5(j9 var1, String var2, j4 var3) {
      super(var3);
      this.n5 = var2;
      this.u3 = var1;
   }
}
