package com.aspose.slides.internal.i0;

import com.aspose.slides.exceptions.ArgumentException;

public final class z1 extends f2 {
   private k5 n5;
   private long l6;

   public final k5 n5() {
      return this.n5;
   }

   public final void n5(k5 var1) {
      this.n5 = var1;
   }

   public final long l6() {
      return this.l6;
   }

   public final void n5(long var1) {
      this.l6 = var1;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5(
         "{0}, BrushData: {1}, Type: {2}", super.toString(), this.n5, com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.g8.k5.class, this.l6)
      );
   }

   private boolean n5(z1 var1) {
      return com.aspose.slides.ms.System.j8.n5(this.n5, var1.n5) && this.l6 == var1.l6;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else {
         return com.aspose.slides.ms.System.j8.l6(this, obj) ? true : com.aspose.slides.internal.v6g.k5.l6(obj, z1.class) && this.n5((z1)obj);
      }
   }

   @Override
   public int hashCode() {
      return (this.n5 != null ? this.n5.hashCode() : 0) * 397 ^ (int)this.l6;
   }

   @Override
   public int u9() {
      return 8 + this.n5.u9();
   }

   public final com.aspose.slides.internal.o9b.u3 k5() {
      com.aspose.slides.internal.o9b.u3 var1 = null;
      switch ((int)this.l6()) {
         case 0:
            d1 var2 = (d1)this.n5();
            var1 = new com.aspose.slides.internal.o9b.i1(var2.n5().a6().o8());
            break;
         case 1:
            e5 var3 = (e5)this.n5();
            var1 = new com.aspose.slides.internal.x4g.n3((int)var3.k5(), var3.l6().a6().o8(), var3.n5().a6().o8());
            break;
         case 2:
            c3 var4 = (c3)this.n5();
            int var5 = (int)var4.l6();
            com.aspose.slides.internal.o9b.t4 var6 = null;
            com.aspose.slides.internal.x4g.m1 var7 = new com.aspose.slides.internal.x4g.m1();
            if (var4.k5() == null) {
               throw new ArgumentException("Bitmap data is missed");
            }

            l4 var8 = var4.k5();
            if ((var4.n5() & 2L) > 0L) {
               if (var8.n5() == null) {
                  throw new ArgumentException("Transformation info is missed");
               }

               var7 = var8.n5().c8();
            }

            var6 = var8.l6().n5().n5();
            com.aspose.slides.internal.o9b.u6 var26 = new com.aspose.slides.internal.o9b.u6(var6, var5);
            var26.k5(var7);
            var1 = var26;
            break;
         case 3:
            x9 var9 = (x9)this.n5();
            n3 var10 = var9.c8();
            com.aspose.slides.internal.x4g.m3 var13;
            if (com.aspose.slides.internal.v6g.k5.l6(var10, y4.class)) {
               y4 var28 = com.aspose.slides.internal.v6g.k5.n5(var10, y4.class);
               com.aspose.slides.internal.x4g.s7 var34 = var28.n5().c8();
               var13 = new com.aspose.slides.internal.x4g.m3(var34);
            } else {
               e2 var27 = com.aspose.slides.internal.v6g.k5.n5(var10, e2.class);
               com.aspose.slides.internal.o9b.w1[] var33 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
                  com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), var27.n5())
               );

               for (int var38 = 0; var38 < var33.length; var38++) {
                  var27.l6()[var38].n5().n5(var33[var38]);
               }

               var13 = new com.aspose.slides.internal.x4g.m3(var33);
            }

            var13.n5((int)var9.l6());
            var13.n5(var9.k5().a6().o8());
            var13.n5(var9.u3().n5().u3());
            if ((var9.a6() & 4294967295L) > 0L) {
               n5[] var29 = var9.h0();
               com.aspose.slides.internal.o9b.c8[] var35 = (com.aspose.slides.internal.o9b.c8[])com.aspose.slides.ms.System.u3.n5(
                  com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.c8.class), var29.length)
               );

               for (int var39 = 0; var39 < var29.length; var39++) {
                  var29[var39].a6().n5(var35[var39]);
               }

               var13.n5(var35);
            }

            if ((var9.n5() & 2L) > 0L) {
               var13.k5(var9.t2().n5().c8());
            } else {
               var13.k5(new com.aspose.slides.internal.x4g.m1());
            }

            if ((var9.n5() & 4L) > 0L) {
               t2 var30 = (t2)var9.t2().l6();
               com.aspose.slides.internal.x4g.a6 var36 = new com.aspose.slides.internal.x4g.a6((int)var30.l6());
               com.aspose.slides.internal.o9b.c8[] var40 = (com.aspose.slides.internal.o9b.c8[])com.aspose.slides.ms.System.u3.n5(
                  com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.c8.class), (int)var30.l6())
               );
               float[] var42 = new float[(int)var30.l6()];

               for (int var44 = 0; var44 < (var30.l6() & 4294967295L); var44++) {
                  var30.k5()[var44].a6().n5(var40[var44]);
                  var42[var44] = var30.n5()[var44];
               }

               var36.n5(var40);
               var36.n5(var42);
               var13.n5(var36);
            }

            if ((var9.n5() & 8L) > 0L) {
               s7 var31 = (s7)var9.t2().l6();
               com.aspose.slides.internal.x4g.u3 var37 = new com.aspose.slides.internal.x4g.u3((int)var31.l6());
               float[] var41 = new float[(int)var31.l6()];
               float[] var43 = new float[(int)var31.l6()];

               for (int var45 = 0; var45 < (var31.l6() & 4294967295L); var45++) {
                  var41[var45] = var31.k5()[var45];
                  var43[var45] = var31.n5()[var45];
               }

               var37.n5(var41);
               var37.l6(var43);
               var13.n5(var37);
            }

            if ((var9.n5() & 64L) > 0L) {
               s3 var32 = var9.t2().k5();
               var13.l6(new com.aspose.slides.internal.o9b.w1(var32.n5(), var32.l6()));
            }

            var1 = var13;
            break;
         case 4:
            a5 var11 = (a5)this.n5();
            com.aspose.slides.internal.o9b.y1 var12 = var11.u3().n5().y4();
            com.aspose.slides.internal.o9b.w1 var14 = var12.u9().u3();
            com.aspose.slides.internal.o9b.w1 var15 = new com.aspose.slides.internal.o9b.w1(var14.l6() + var12.s7(), var14.k5() + var12.k5());
            com.aspose.slides.internal.x4g.z3 var16 = new com.aspose.slides.internal.x4g.z3(var14.u3(), var15.u3(), var11.c8().a6().o8(), var11.l6().a6().o8());
            var16.n5((int)var11.t2());
            if ((var11.n5() & 128L) > 0L) {
               var16.l6(true);
            }

            if ((var11.n5() & 2L) > 0L) {
               var16.k5(var11.k5().n5().c8());
            } else {
               var16.k5(new com.aspose.slides.internal.x4g.m1());
            }

            if ((var11.n5() & 8L) > 0L) {
               c8[] var17 = var11.k5().l6();

               for (int var18 = 0; var18 < var17.length; var18++) {
                  if (var17[var18] != null) {
                     s7 var19 = (s7)var17[var18];
                     com.aspose.slides.internal.x4g.u3 var20 = new com.aspose.slides.internal.x4g.u3((int)var19.l6());
                     float[] var21 = new float[(int)var19.l6()];
                     float[] var22 = new float[(int)var19.l6()];

                     for (int var23 = 0; var23 < (var19.l6() & 4294967295L); var23++) {
                        var21[var23] = var19.k5()[var23];
                        var22[var23] = var19.n5()[var23];
                     }

                     var20.n5(var21);
                     var20.l6(var22);
                     var16.n5(var20);
                     break;
                  }
               }
            }

            if ((var11.n5() & 4L) > 0L) {
               c8[] var46 = var11.k5().l6();
               t2 var47 = (t2)var46[0];
               com.aspose.slides.internal.x4g.a6 var48 = new com.aspose.slides.internal.x4g.a6((int)var47.l6());
               com.aspose.slides.internal.o9b.c8[] var49 = (com.aspose.slides.internal.o9b.c8[])com.aspose.slides.ms.System.u3.n5(
                  com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.c8.class), (int)var47.l6())
               );
               float[] var50 = new float[(int)var47.l6()];

               for (int var51 = 0; var51 < (var47.l6() & 4294967295L); var51++) {
                  var47.k5()[var51].a6().n5(var49[var51]);
                  var50[var51] = var47.n5()[var51];
               }

               var48.n5(var49);
               var48.n5(var50);
               var16.n5(var48);
            }

            var1 = var16;
            break;
         default:
            throw new ArgumentException("unknown brush type");
      }

      return var1;
   }
}
