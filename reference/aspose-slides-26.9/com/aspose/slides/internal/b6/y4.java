package com.aspose.slides.internal.b6;

public class y4 extends u3 {
   @Override
   public void l6(com.aspose.slides.internal.i3.v4 var1, com.aspose.slides.internal.o9b.z1 var2, com.aspose.slides.internal.g1.u9 var3) {
      com.aspose.slides.internal.i3.y4 var4 = (com.aspose.slides.internal.i3.y4)var1;
      com.aspose.slides.internal.o9b.y2 var5 = new com.aspose.slides.internal.o9b.y2(var4.k5(), var4.l6(), var4.t2(), var4.c8());
      com.aspose.slides.internal.o9b.y2 var6 = new com.aspose.slides.internal.o9b.y2(var4.u9(), var4.u3(), var4.t2(), var4.c8());
      long var7 = var4.n5();
      com.aspose.slides.internal.o9b.l6 var9 = null;
      if (var4.x8()) {
         var9 = var4.s7().l6(var3.x8());
      } else {
         switch ((int)var7) {
            case 0:
            case 170:
            case 240:
            case 255:
               break;
            default:
               var9 = new com.aspose.slides.internal.o9b.l6(var4.t2(), var4.c8());
               com.aspose.slides.internal.o9b.z1 var10 = com.aspose.slides.internal.o9b.z1.n5(var9);

               try {
                  com.aspose.slides.internal.o9b.y2 var11 = new com.aspose.slides.internal.o9b.y2(0, 0, var4.t2(), var4.c8());
                  var10.n5(var3.z3(), var11.n3(), var5.n3(), 2);
                  var11.u3(var5);
               } finally {
                  if (var10 != null) {
                     var10.dispose();
                  }
               }
         }
      }

      this.n5(var7, var9, var5.n3(), var6.n3(), var4.x8(), var2, var3);
   }
}
