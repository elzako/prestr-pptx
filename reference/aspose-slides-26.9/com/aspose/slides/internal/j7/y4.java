package com.aspose.slides.internal.j7;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.o9b.t4;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.e5;

public class y4 implements IDisposable {
   private boolean n5 = false;
   private static final Dictionary<Integer, Integer> l6 = new Dictionary<>();
   private int k5;
   private t4 u3;
   private com.aspose.slides.internal.j9e.h0 a6;
   private boolean u9;

   @Override
   public final void dispose() {
      this.n5(true);
      e5.n5(this);
   }

   protected void n5(boolean var1) {
      if (!this.n5) {
         if (this.u9 && this.u3 != null) {
            this.u3.dispose();
            this.u3 = null;
         }

         this.n5 = true;
      }
   }

   public final void n5(com.aspose.slides.internal.o9b.l6 var1, com.aspose.slides.internal.z0k.t4 var2, int var3, boolean var4) {
      this.k5 = var3;
      this.u3 = n5(var1, var3);
      com.aspose.slides.internal.j9e.s7 var5 = com.aspose.slides.internal.s5.h0.n5(com.aspose.slides.internal.j9e.x8.x8());
      this.a6 = n5(var3, var4);
      this.u3.n5(var2, var5, this.a6);
      this.u9 = this.u3 != var1;
   }

   private static com.aspose.slides.internal.o9b.l6 n5(com.aspose.slides.internal.o9b.l6 var0, int var1) {
      switch (var1) {
         case 2:
         case 3:
         case 4:
            if (var0.s7() != 196865) {
               var0 = new com.aspose.slides.internal.s5.l6().l6(var0);
            }
         default:
            return var0;
      }
   }

   private static com.aspose.slides.internal.j9e.h0 n5(int var0, boolean var1) {
      com.aspose.slides.internal.j9e.u9 var2 = new com.aspose.slides.internal.j9e.u9(com.aspose.slides.internal.j9e.a6.k5, (long)n5(var0));
      if (var1) {
         com.aspose.slides.internal.j9e.h0 var4 = new com.aspose.slides.internal.j9e.h0(2);
         var4.n5()[0] = new com.aspose.slides.internal.j9e.u9(com.aspose.slides.internal.j9e.a6.h0, 18L);
         var4.n5()[1] = var2;
         return var4;
      } else {
         com.aspose.slides.internal.j9e.h0 var3 = new com.aspose.slides.internal.j9e.h0();
         var3.n5()[0] = var2;
         return var3;
      }
   }

   private static int n5(int var0) {
      byte var1 = 0;
      Integer[] var2 = new Integer[]{Integer.valueOf(var1)};
      l6.tryGetValue(var0, var2);
      return var2[0];
   }

   static {
      l6.addItem(1, 6);
      l6.addItem(2, 5);
      l6.addItem(5, 2);
      l6.addItem(3, 3);
      l6.addItem(4, 4);
   }
}
