package com.aspose.slides.internal.v9;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.a4.b3;
import com.aspose.slides.internal.a4.p8;
import com.aspose.slides.internal.i0.e9;
import com.aspose.slides.internal.i0.i9;
import com.aspose.slides.internal.i0.o0;
import com.aspose.slides.internal.i0.p3;
import com.aspose.slides.internal.i0.r4;
import com.aspose.slides.internal.i0.s4;
import com.aspose.slides.internal.i0.z1;
import com.aspose.slides.internal.i0.z7;
import com.aspose.slides.internal.j9e.t2;
import com.aspose.slides.internal.l5.c8;
import com.aspose.slides.internal.o9b.a0;
import com.aspose.slides.internal.o9b.e5;
import com.aspose.slides.internal.o9b.m3;
import com.aspose.slides.internal.o9b.n3;
import com.aspose.slides.internal.o9b.u3;
import com.aspose.slides.internal.x3.a6;
import com.aspose.slides.internal.x3.k5;
import com.aspose.slides.internal.x4g.s7;
import com.aspose.slides.internal.x4g.u9;

public class n5 extends k5 {
   @Override
   protected void l6(b3 var1, a6 var2) {
      p8 var3 = (p8)var1;
      if (!var3.k5() || var3.s7() != null) {
         int var4 = var3.c8() & 255;
         switch (var3.u3()) {
            case 0:
               throw new NotSupportedException("Invalid objects are not supported");
            case 1:
               z1 var5 = (z1)var3.s7();
               u3 var6 = var5.k5();
               var2.n5(var4, var6, var5);
               break;
            case 2:
               e9 var7 = (e9)var3.s7();
               m3 var8 = var7.u3();
               var2.n5(var4, var8, var7);
               break;
            case 3:
               p3 var9 = (p3)var3.s7();
               s7 var10 = var9.c8();
               var2.n5(var4, var10, var9);
               break;
            case 4:
               i9 var11 = (i9)var3.s7();
               a0 var12 = var11.k5();
               var2.n5(var4, var12, var11);
               break;
            case 5:
               o0 var13 = (o0)var3.s7();
               c8 var14 = var13.n5().l6();
               var2.n5(var4, var14, var13);
               break;
            case 6:
               com.aspose.slides.internal.i0.p8 var15 = (com.aspose.slides.internal.i0.p8)var3.s7();
               n3 var16 = var15.c8();
               var2.n5(var4, var16, var15);
               break;
            case 7:
               s4 var17 = (s4)var3.s7();
               e5 var18 = var17.q0();
               var2.n5(var4, var18, var17);
               break;
            case 8:
               z7 var19 = (z7)var3.s7();
               t2 var20 = var19.h0();
               var2.n5(var4, var20, var19);
               break;
            case 9:
               r4 var21 = (r4)var3.s7();
               u9 var22 = var21.k5();
               var2.n5(var4, var22, var21);
               break;
            default:
               throw new ArgumentOutOfRangeException();
         }
      }
   }
}
