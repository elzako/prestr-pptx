package com.aspose.slides.internal.n1b;

import java.awt.Shape;
import java.awt.geom.PathIterator;
import java.awt.geom.Path2D.Double;

public class u3 {
   public static Shape n5(Shape var0, n5 var1) {
      return n5(var0.getPathIterator(null), var1);
   }

   public static Shape n5(PathIterator var0, n5 var1) {
      Double var2 = new Double();
      var2.setWindingRule(var0.getWindingRule());
      double[] var3 = new double[6];
      double var4 = 0.0;
      double var6 = 0.0;

      while (!var0.isDone()) {
         switch (var0.currentSegment(var3)) {
            case 0:
               double var33 = var3[0];
               double var40 = var3[1];
               double var46 = var1.n5(var33);
               double var51 = var1.l6(var40);
               double var55 = var46 - var33;
               double var59 = var51 - var40;
               var33 = var46;
               var40 = var51;
               var4 = var55;
               var6 = var59;
               var2.moveTo(var33, var40);
               break;
            case 1:
               double var31 = var3[0];
               double var38 = var3[1];
               double var45 = var1.n5(var31);
               double var50 = var1.l6(var38);
               double var54 = var45 - var31;
               double var58 = var50 - var38;
               var31 = var45;
               var38 = var50;
               var4 = var54;
               var6 = var58;
               var2.lineTo(var31, var38);
               break;
            case 2:
               double var29 = var3[0];
               double var36 = var3[1];
               double var43 = var3[2];
               double var48 = var3[3];
               double var53 = var1.n5(var43);
               double var57 = var1.l6(var48);
               double var60 = var53 - var43;
               double var61 = var57 - var48;
               var43 = var53;
               var48 = var57;
               var29 += (var4 + var60) / 2.0;
               var36 += (var6 + var61) / 2.0;
               var4 = var60;
               var6 = var61;
               var2.quadTo(var29, var36, var43, var48);
               break;
            case 3:
               double var8 = var3[0];
               double var10 = var3[1];
               double var12 = var3[2];
               double var14 = var3[3];
               double var16 = var3[4];
               double var18 = var3[5];
               double var20 = var1.n5(var16);
               double var22 = var1.l6(var18);
               double var24 = var20 - var16;
               double var26 = var22 - var18;
               var16 = var20;
               var18 = var22;
               var8 += var4;
               var10 += var6;
               var12 += var24;
               var14 += var26;
               var4 = var24;
               var6 = var26;
               var2.curveTo(var8, var10, var12, var14, var16, var18);
               break;
            case 4:
               var2.closePath();
         }

         var0.next();
      }

      return var2;
   }

   public static Shape l6(PathIterator var0, n5 var1) {
      Double var2 = new Double();
      var2.setWindingRule(var0.getWindingRule());
      double[] var3 = new double[6];

      while (!var0.isDone()) {
         switch (var0.currentSegment(var3)) {
            case 0:
               double var18 = var1.n5(var3[0]);
               double var21 = var1.l6(var3[1]);
               var2.moveTo(var18, var21);
               break;
            case 1:
               double var17 = var1.n5(var3[0]);
               double var20 = var1.l6(var3[1]);
               var2.lineTo(var17, var20);
               break;
            case 2:
               double var16 = var1.n5(var3[0]);
               double var19 = var1.l6(var3[1]);
               double var22 = var1.n5(var3[2]);
               double var23 = var1.l6(var3[3]);
               var2.quadTo(var16, var19, var22, var23);
               break;
            case 3:
               double var4 = var1.n5(var3[0]);
               double var6 = var1.l6(var3[1]);
               double var8 = var1.n5(var3[2]);
               double var10 = var1.l6(var3[3]);
               double var12 = var1.n5(var3[4]);
               double var14 = var1.l6(var3[5]);
               var2.curveTo(var4, var6, var8, var10, var12, var14);
               break;
            case 4:
               var2.closePath();
         }

         var0.next();
      }

      return var2;
   }
}
