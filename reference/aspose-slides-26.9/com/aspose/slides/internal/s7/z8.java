package com.aspose.slides.internal.s7;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;

public class z8 extends com.aspose.slides.internal.n3.e2 {
   @Override
   public String n5() {
      return "border-image";
   }

   @Override
   public int l6() {
      return 41;
   }

   @Override
   public boolean k5() {
      return false;
   }

   @Override
   public void n5(com.aspose.slides.internal.h0.h0 var1, com.aspose.slides.internal.z8.t4 var2, com.aspose.slides.internal.z8.y4 var3, boolean var4) {
      com.aspose.slides.internal.u3.c8 var5 = ((com.aspose.slides.internal.n3.h0)var1.h0(45)).a6();
      com.aspose.slides.internal.u3.c8 var6 = ((com.aspose.slides.internal.n3.s7)var1.h0(44)).a6();
      com.aspose.slides.internal.u3.c8 var7 = ((com.aspose.slides.internal.n3.s7)var1.h0(46)).a6();
      com.aspose.slides.internal.u3.c8 var8 = ((com.aspose.slides.internal.n3.h0)var1.h0(43)).a6();
      List var9 = new List();
      List var10 = new List();
      List var11 = new List();
      List var12 = new List();
      List var13 = new List();
      IGenericEnumerator var14 = com.aspose.slides.internal.z8.n5.n5(var3).iterator();

      for (int var15 = 1; var14.hasNext(); var15++) {
         com.aspose.slides.internal.z8.y4 var16 = (com.aspose.slides.internal.z8.y4)var14.next();
         switch (var16.n5()) {
            case 4:
               if (!var14.hasNext()) {
                  throw this.n5(var16.n5());
               }

               var16 = (com.aspose.slides.internal.z8.y4)var14.next();
               switch (var16.n5()) {
                  case 13:
                  case 14:
                  case 15:
                  case 16:
                  case 17:
                  case 18:
                  case 19:
                  case 20:
                  case 21:
                  case 22:
                  case 23:
                     var11.addItem(var16);
                     continue;
                  default:
                     throw this.n5(var16.n5());
               }
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 25:
            case 26:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            default:
               throw this.n5(var16.n5());
            case 12:
               var9.addItem(var16);
               var10.addItem(var16);
               var11.addItem(var16);
               var12.addItem(var16);
               var13.addItem(var16);
               break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
               if (var15 == 2) {
                  var10.addItem(var16);
               } else if (var15 == 3) {
                  var11.addItem(var16);
               } else if (var15 == 4) {
                  var12.addItem(var16);
               }
               break;
            case 24:
               var9.addItem(var16);
               break;
            case 27:
               var9.addItem(var16);
               break;
            case 35:
               String var17 = com.aspose.slides.ms.System.d1.a6(var16.t2());
               if (var5.n5(var17) != null) {
                  var9.addItem(var16);
               } else if (var6.n5(var17) != null) {
                  var10.addItem(var16);
               } else if (var7.n5(var17) != null) {
                  var11.addItem(var16);
               } else {
                  if (var8.n5(var17) == null) {
                     throw this.n5(var16.n5());
                  }

                  var13.addItem(var16);
               }
         }
      }

      this.n5(var2, "border-image-source", var9, var4);
      this.n5(var2, "border-image-slice", var10, var4);
      this.n5(var2, "border-image-width", var11, var4);
      this.n5(var2, "border-image-outset", var12, var4);
      this.n5(var2, "border-image-repeat", var13, var4);
   }
}
