package com.aspose.slides.internal.u5;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.f5.c4;
import com.aspose.slides.internal.f5.z1;
import com.aspose.slides.internal.f5.z3;
import com.aspose.slides.internal.h0.z8;
import com.aspose.slides.internal.k5.f2;
import com.aspose.slides.internal.k5.i1;
import com.aspose.slides.internal.k5.j5;
import com.aspose.slides.internal.k5.m1;
import com.aspose.slides.internal.k5.w1;
import com.aspose.slides.internal.v6g.u9;
import com.aspose.slides.internal.w8.d5;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.r8;
import com.aspose.slides.ms.System.u3;

public class n5 implements i1 {
   private List<f2> n5;
   private static final String[] l6 = new String[]{"STYLE", "LINK"};
   private static final u9 k5 = new u9("STYLE", "LINK");

   public n5(z1 var1) {
      z8 var2 = ((m1)var1).n5();
      c4 var3 = var1.n5(u3.n5(l6));
      this.n5 = new List<>();
      IGenericEnumerator var4 = var3.iterator();

      while (var4.hasNext()) {
         switch (k5.n5(((z3)var4.next()).a6())) {
            case 0:
               w1 var5 = (w1)var4.next();
               if (var5.n5() != null) {
                  this.n5.addItem(var5.n5());
               }
               break;
            case 1:
               d5 var6 = (d5)var4.next();
               if (var6.w2() != null && d1.u3(var6.w2(), "stylesheet", (short)5)) {
                  String var7 = var6.e9();
                  if (!d1.n5(var7)) {
                     r8 var8 = null;
                     r8[] var9 = new r8[]{var8};
                     boolean var10 = r8.n5(var7, 0, var9) && !var9[0].z3() && !d1.n5(var1.r4().c8().n5());
                     var8 = var9[0];
                     if (var10) {
                        String var11 = com.aspose.slides.internal.z0k.z1.l6(var1.r4().c8().n5(), var7);
                        r8 var12 = null;
                        r8[] var13 = new r8[]{var12};
                        boolean var14 = r8.n5(var11, 0, var13) && var13[0].z3();
                        var12 = var13[0];
                        if (var14) {
                           var7 = var12.x8();
                        }
                     }

                     j5 var16 = var2.n5(var7, var6);
                     if (var16 != null) {
                        this.n5.addItem(var16);
                     }
                  }
               }
         }
      }
   }

   @Override
   public final IGenericEnumerator<f2> iterator() {
      return this.n5.iterator();
   }

   @Override
   public final long n5() {
      return this.n5.size();
   }

   @Override
   public final j5 n5(int var1) {
      return (j5)this.n5.get_Item(var1);
   }
}
