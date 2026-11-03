package com.aspose.slides.internal.k2s;

import com.aspose.slides.internal.e1x.i1;
import com.aspose.slides.internal.e1x.u6;
import com.aspose.slides.internal.e1x.x8;
import com.aspose.slides.internal.o9b.y4;
import com.aspose.slides.ms.System.t9;

public abstract class h0 implements n5 {
   private com.aspose.slides.internal.p1s.l6 n5;
   private final a6 l6;

   protected h0(com.aspose.slides.internal.p1s.l6 var1, a6 var2) {
      this.n5 = var1;
      this.l6 = var2;
      i1 var3 = var1.n5();

      for (int var4 = 0; var4 < var2.c8.length(); var4++) {
         if (var3.h0().n5(var2.c8.charAt(var4)) == null) {
            for (y4 var8 : y4.n5()) {
               var3 = x8.u3().n5(var8.a6(), var1.l6());
               if (var3 != null) {
                  u6 var9 = var3.h0().n5(var2.c8.charAt(var4));
                  if (var9 != null) {
                     this.n5 = new com.aspose.slides.internal.p1s.l6(var1.c8(), var1.l6(), var3);
                     break;
                  }
               }
            }
         }
      }
   }

   public final com.aspose.slides.internal.p1s.l6 n5() {
      return this.n5;
   }

   public final a6 l6() {
      return this.l6;
   }

   @Override
   public final float n5(char var1, char var2) {
      return 0.0F;
   }

   @Override
   public final float n5(char var1) {
      float var2 = !t9.t9(var1) && this.l6.n5() && (this.n5.n5().c8() & 1) == 0 ? 0.022F * this.n5.c8() : 0.0F;
      return this.n5.n5(var1) + var2;
   }

   @Override
   public final float n5(String var1) {
      return this.n5.l6(var1).l6();
   }
}
