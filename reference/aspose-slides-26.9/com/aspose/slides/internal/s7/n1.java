package com.aspose.slides.internal.s7;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.k5.l6$n5;
import com.aspose.slides.ms.System.IDisposable;

public class n1 extends com.aspose.slides.internal.n3.h0 {
   private static final com.aspose.slides.internal.u3.c8<com.aspose.slides.internal.k5.u9> n5 = new com.aspose.slides.internal.u3.c8<>();
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("attr(", "counter(", "counters(");

   @Override
   public String n5() {
      return "content";
   }

   @Override
   public int l6() {
      return 83;
   }

   @Override
   public boolean k5() {
      return false;
   }

   @Override
   public com.aspose.slides.internal.k5.u9 u3() {
      return l6$n5.d2;
   }

   @Override
   public com.aspose.slides.internal.u3.c8<com.aspose.slides.internal.k5.u9> a6() {
      return n5;
   }

   @Override
   public com.aspose.slides.internal.k5.u9 n5(com.aspose.slides.internal.z8.y4 var1, com.aspose.slides.internal.h0.h0 var2) {
      switch (var1.n5()) {
         case 12:
            return l6$n5.n5;
         case 35:
            com.aspose.slides.internal.k5.u9 var3 = this.a6().n5(com.aspose.slides.ms.System.d1.a6(var1.t2()));
            if (var3 != null && (var3 == l6$n5.a0 || var3 == l6$n5.d2)) {
               return var3;
            }
         default:
            com.aspose.slides.internal.k5.h0 var9 = new com.aspose.slides.internal.k5.h0();

            while (var1 != null) {
               label98:
               switch (var1.n5()) {
                  case 24:
                     var9.l6(new com.aspose.slides.internal.y4.t4(var1.t2()));
                     break;
                  case 35:
                     com.aspose.slides.internal.k5.u9 var4 = this.a6().n5(com.aspose.slides.ms.System.d1.a6(var1.t2()));
                     if (var4 == null) {
                        throw this.n5(var1.t2());
                     }

                     var9.l6(var4);
                     break;
                  case 36:
                     var9.l6(new com.aspose.slides.internal.y4.t9(var1.t2()));
                     break;
                  case 41:
                     switch (l6.n5(com.aspose.slides.ms.System.d1.a6(var1.h0()))) {
                        case 0:
                           com.aspose.slides.internal.z8.y4 var19 = var1.c8();
                           if (var19.k5() != null) {
                              throw this.k5(var1.h0());
                           }

                           var9.l6(new com.aspose.slides.internal.y4.t9(var1.c8().t2(), (short)22));
                           break label98;
                        case 1:
                           com.aspose.slides.internal.z8.y4 var15 = var1.c8();
                           if (var15 == null) {
                              throw this.k5(var1.h0());
                           }

                           if (var15.n5() != 35) {
                              throw this.k5(var1.h0());
                           }

                           com.aspose.slides.internal.y4.t9 var20 = com.aspose.slides.internal.y4.t9.k5(var15.t2());
                           com.aspose.slides.internal.y4.t9 var21 = null;
                           var15 = var15.k5();
                           if (var15 != null) {
                              if (var15.n5() != 0) {
                                 throw this.k5(var1.h0());
                              }

                              var15 = var15.k5();
                              if (var15.n5() != 35) {
                                 throw this.k5(var1.h0());
                              }

                              var21 = com.aspose.slides.internal.y4.t9.k5(var15.t2());
                              var15 = var15.k5();
                              if (var15 != null) {
                                 if (var15.n5() != 35 && var15.n5() != 36) {
                                    throw this.n5(var1.n5());
                                 }

                                 throw this.n5(var15.t2());
                              }
                           }

                           var9.l6(new com.aspose.slides.internal.y4.u3(var20, var21));
                           break label98;
                        case 2:
                           com.aspose.slides.internal.z8.y4 var5 = var1.c8();
                           if (var5 == null) {
                              throw this.k5(var1.h0());
                           }

                           if (var5.n5() != 35) {
                              throw this.k5(var1.h0());
                           }

                           com.aspose.slides.internal.y4.t9 var6 = com.aspose.slides.internal.y4.t9.k5(var5.t2());
                           var5 = var5.k5();
                           if (var5.n5() != 0) {
                              throw this.k5(var1.h0());
                           }

                           var5 = var5.k5();
                           if (var5.n5() != 36) {
                              throw this.k5(var1.h0());
                           }

                           com.aspose.slides.internal.y4.t9 var7 = com.aspose.slides.internal.y4.t9.k5(var5.t2());
                           com.aspose.slides.internal.y4.t9 var8 = null;
                           var5 = var5.k5();
                           if (var5 != null) {
                              if (var5.n5() != 0) {
                                 throw this.k5(var1.h0());
                              }

                              var5 = var5.k5();
                              if (var5.n5() != 35) {
                                 throw this.k5(var1.h0());
                              }

                              var8 = com.aspose.slides.internal.y4.t9.k5(var5.t2());
                              var5 = var5.k5();
                              if (var5 != null) {
                                 if (var5.n5() != 35 && var5.n5() != 36) {
                                    throw this.n5(var1.n5());
                                 }

                                 throw this.n5(var5.t2());
                              }
                           }

                           var9.l6(new com.aspose.slides.internal.y4.a6(var6, var8, var7));
                           break label98;
                        default:
                           throw this.n5(var1.n5());
                     }
                  default:
                     throw com.aspose.slides.internal.z8.u9.n5(var1.n5());
               }

               var1 = var1.k5();
            }

            return var9;
      }
   }

   @Override
   public com.aspose.slides.internal.k5.u9 n5(
      com.aspose.slides.internal.k5.k7 var1,
      com.aspose.slides.internal.h0.h0 var2,
      String var3,
      com.aspose.slides.internal.y4.z1 var4,
      com.aspose.slides.internal.k5.u9 var5,
      int var6
   ) {
      com.aspose.slides.internal.k5.h0 var7 = com.aspose.slides.internal.v6g.k5.n5(var5, com.aspose.slides.internal.k5.h0.class);
      if (var7 == null) {
         return super.n5(var1, var2, var3, var4, var5, var6);
      }

      com.aspose.slides.internal.k5.h0 var8 = new com.aspose.slides.internal.k5.h0();
      IGenericEnumerator var9 = var7.iterator();

      try {
         while (var9.hasNext()) {
            com.aspose.slides.internal.k5.u3 var10 = (com.aspose.slides.internal.k5.u3)var9.next();
            if (var10.n5() == 22) {
               com.aspose.slides.internal.j3.z3 var25 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.j3.z3.class);
               if (var25 == null) {
                  return com.aspose.slides.internal.y4.t9.l6(com.aspose.slides.ms.System.d1.n5);
               }

               String var27 = var25.u3(var10.l6());
               if (var27 == null) {
                  var27 = com.aspose.slides.ms.System.d1.n5;
               }

               var8.l6(new com.aspose.slides.internal.y4.t9(var27, (short)22));
            } else if (var10.n5() == 23) {
               if (com.aspose.slides.internal.v6g.k5.l6(var10, com.aspose.slides.internal.y4.u3.class)) {
                  com.aspose.slides.internal.k5.t2 var24 = var10.k5();
                  int var26 = var1.l6().n5(var24.n5(), var3);
                  com.aspose.slides.internal.t9.n5 var28 = var2.h0().n5(var24.l6());
                  var8.l6(new com.aspose.slides.internal.y4.t9(var28.u9().n5(var26), (short)23));
               } else {
                  com.aspose.slides.internal.k5.t2 var23 = var10.k5();
                  com.aspose.slides.internal.t9.n5 var12 = var2.h0().n5(var23.l6());
                  com.aspose.slides.internal.l7h.a5 var13 = new com.aspose.slides.internal.l7h.a5();
                  int var14 = var1.l6().n5(var23.n5(), var3);
                  var13.n5(0, var12.u9().n5(var14));
                  com.aspose.slides.internal.h0.a6 var15 = (com.aspose.slides.internal.h0.a6)var1.l6();
                  var15 = var15.n5(var23.n5());

                  com.aspose.slides.internal.j3.z8 var16;
                  do {
                     var16 = var15.n5().a5();
                     com.aspose.slides.internal.k5.k7 var17 = com.aspose.slides.internal.v6g.k5.n5(var16, com.aspose.slides.internal.k5.k7.class);
                     var15 = (com.aspose.slides.internal.h0.a6)var17.l6();
                     int[] var18 = new int[]{var14};
                     boolean var19 = var15.n5(var23.n5(), var18);
                     var14 = var18[0];
                     if (var19) {
                        var13.n5(0, var23.k5());
                        var13.n5(0, var12.u9().n5(var14));
                        var15 = var15.n5(var23.n5());
                     }
                  } while (!"html".equals(var16.t2()));

                  var8.l6(new com.aspose.slides.internal.y4.t9(var13.toString(), (short)23));
               }
            } else if (var10.n5() == 19) {
               String var11 = var10.l6();
               if (!com.aspose.slides.ms.System.d1.n5(var11)) {
                  var8.l6(var10);
               }
            } else {
               var8.l6(var10);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
            var9.dispose();
         }
      }

      return var8;
   }

   static {
      n5.n5("normal", l6$n5.d2);
      n5.n5("none", l6$n5.a0);
      n5.n5("open-quote", l6$n5.y9w);
      n5.n5("close-quote", l6$n5.i0e);
      n5.n5("no-open-quote", l6$n5.f6z);
      n5.n5("no-close-quote", l6$n5.u1s);
   }
}
