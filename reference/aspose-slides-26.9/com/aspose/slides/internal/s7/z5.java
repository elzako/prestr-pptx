package com.aspose.slides.internal.s7;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;

public class z5 extends com.aspose.slides.internal.n3.e2 {
   @Override
   public String n5() {
      return "font";
   }

   @Override
   public int l6() {
      return 113;
   }

   @Override
   public boolean k5() {
      return true;
   }

   @Override
   public void n5(com.aspose.slides.internal.h0.h0 var1, com.aspose.slides.internal.z8.t4 var2, com.aspose.slides.internal.z8.y4 var3, boolean var4) {
      com.aspose.slides.internal.u3.c8 var5 = ((com.aspose.slides.internal.n3.h0)var1.h0(119)).a6();
      com.aspose.slides.internal.u3.c8 var6 = ((com.aspose.slides.internal.n3.h0)var1.h0(126)).a6();
      com.aspose.slides.internal.u3.c8 var7 = ((com.aspose.slides.internal.n3.h0)var1.h0(121)).a6();
      com.aspose.slides.internal.u3.c8 var8 = ((com.aspose.slides.internal.n3.h0)var1.h0(122)).a6();
      com.aspose.slides.internal.u3.c8 var9 = ((com.aspose.slides.internal.n3.h0)var1.h0(123)).a6();
      com.aspose.slides.internal.u3.c8 var10 = ((com.aspose.slides.internal.n3.h0)var1.h0(124)).a6();
      com.aspose.slides.internal.u3.c8 var11 = ((com.aspose.slides.internal.n3.h0)var1.h0(125)).a6();
      com.aspose.slides.internal.u3.c8 var12 = ((com.aspose.slides.internal.n3.s7)var1.h0(127)).a6();
      com.aspose.slides.internal.u3.c8 var13 = ((com.aspose.slides.internal.n3.h0)var1.h0(118)).a6();
      com.aspose.slides.internal.u3.c8 var14 = ((com.aspose.slides.internal.n3.s7)var1.h0(116)).a6();
      com.aspose.slides.internal.u3.c8 var15 = ((com.aspose.slides.internal.n3.s7)var1.h0(153)).a6();
      List var16 = new List();
      List var17 = new List();
      List var18 = new List();
      List var19 = new List();
      List var20 = new List();
      List var21 = new List();
      List var22 = new List();
      IGenericEnumerator var23 = com.aspose.slides.internal.z8.n5.n5(var3).iterator();

      while (var23.hasNext()) {
         com.aspose.slides.internal.z8.y4 var24 = (com.aspose.slides.internal.z8.y4)var23.next();
         switch (var24.n5()) {
            case 0:
            case 36:
               var21.addItem(var24);
               break;
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            default:
               throw this.n5(var24.n5());
            case 4:
               if (!var23.hasNext()) {
                  throw this.n5(var24.n5());
               }

               var24 = (com.aspose.slides.internal.z8.y4)var23.next();
               switch (var24.n5()) {
                  case 12:
                     var22.addItem(var24);
                     continue;
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
                     var22.addItem(var24);
                  case 24:
                  case 25:
                  case 26:
                  case 27:
                  case 28:
                  case 29:
                  case 30:
                  case 31:
                  case 32:
                  case 33:
                  case 34:
                  default:
                     continue;
                  case 35:
                     String var28 = com.aspose.slides.ms.System.d1.a6(var24.t2());
                     if (var15.n5(var28) == null) {
                        throw this.n5(var24.n5());
                     }

                     var22.addItem(var24);
                     continue;
               }
            case 12:
               var16.addItem(var24);
               var17.addItem(var24);
               var18.addItem(var24);
               var19.addItem(var24);
               var20.addItem(var24);
               break;
            case 13:
               switch (var24.a6()) {
                  case 100:
                  case 200:
                  case 300:
                  case 400:
                  case 500:
                  case 600:
                  case 700:
                  case 800:
                  case 900:
                     var18.addItem(var24);
                  default:
                     continue;
               }
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
               var20.addItem(var24);
               break;
            case 35:
               String var25 = com.aspose.slides.ms.System.d1.a6(var24.t2());
               if (var16.size() == 0 && var5.n5(var25) != null) {
                  var16.addItem(var24);
               } else if (var6.n5(var25) != null
                  || var7.n5(var25) != null
                  || var8.n5(var25) != null
                  || var9.n5(var25) != null
                  || var10.n5(var25) != null
                  || var11.n5(var25) != null) {
                  var17.addItem(var24);
               } else if (var12.n5(var25) != null) {
                  var18.addItem(var24);
               } else if (var13.n5(var25) != null) {
                  var19.addItem(var24);
               } else if (var14.n5(var25) != null) {
                  var20.addItem(var24);
               } else if (var1.c8().n5(var25)) {
                  com.aspose.slides.internal.o9b.n3 var26 = var1.c8().l6(var25);
                  var21.addItem(com.aspose.slides.internal.z8.n5.n5(null, var26.l6().a6()));
                  var20.addItem(com.aspose.slides.internal.z8.n5.n5(null, (short)21, var26.t2()));
               } else {
                  var21.addItem(var24);
               }
         }
      }

      this.n5(var2, "font-style", var16, var4);
      this.n5(var2, "font-variant", var17, var4);
      if (var20.size() != 0 && var21.size() != 0 && var18.size() == 0) {
         var18.addItem(com.aspose.slides.internal.z8.n5.l6(null, "normal"));
      }

      this.n5(var2, "font-weight", var18, var4);
      this.n5(var2, "font-stretch", var19, var4);
      this.n5(var2, "font-size", var20, var4);
      this.n5(var2, "font-family", var21, var4);
      if (var22.size() != 0) {
         this.n5(var2, "line-height", var22, var4);
      }
   }
}
