package com.aspose.slides.internal.g7;

public class z6 extends b2 {
   @Override
   public void n5() {
      e9 var1 = com.aspose.slides.internal.v6g.k5.n5(this.n5, e9.class);
      if (var1 != null) {
         h2 var2 = new h2(this.l6, false);

         try {
            e9 var3 = (e9)this.n5;
            v0 var4 = (v0)var1.e2();
            if (!var3.y4().l6(k3.n5)) {
               var3.y4().n5(k3.n5);
            }

            com.aspose.slides.internal.z0k.e2 var5 = new com.aspose.slides.internal.z0k.e2();

            try {
               a5 var6 = new a5(this.n5.x8().k5()[0].k5(), 0L);

               try {
                  v3 var7 = new v3();
                  byte[] var8 = var6.l6(var4.n5().n5().l6());
                  var5.write(var8, 0, var8.length);
                  var8 = var6.l6((int)(var4.n5().k5().l6() - var4.n5().k5().n5() + 1L));
                  var5.write(var8, 0, var8.length);
                  s0 var9 = new s0(var6);
                  j8 var10 = new j8();
                  var9.n5(var10);
                  i6 var11 = new i6();
                  byte[] var12 = var11.n5(var7, var10);
               } finally {
                  if (var6 != null) {
                     var6.dispose();
                  }
               }
            } finally {
               if (var5 != null) {
                  var5.dispose();
               }
            }

            com.aspose.slides.internal.z0k.n5 var39 = new com.aspose.slides.internal.z0k.n5(this.n5.x8().k5()[0].k5().l6());

            byte[] var37;
            try {
               var37 = var39.c8((int)this.n5.x8().k5()[0].k5().l6().getLength());
            } finally {
               if (var39 != null) {
                  var39.dispose();
               }
            }

            var2.n5(var37);
         } finally {
            if (var2 != null) {
               var2.dispose();
            }
         }
      }
   }
}
