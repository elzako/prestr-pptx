package com.aspose.slides.internal.a8;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.f5.d5;
import com.aspose.slides.internal.f5.r4;
import com.aspose.slides.internal.j3.c4;
import com.aspose.slides.internal.j3.z8;
import com.aspose.slides.internal.k7.e2$n5;
import com.aspose.slides.internal.m3.b5;
import com.aspose.slides.internal.m3.q3;
import com.aspose.slides.internal.m3.z7;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.internal.q0.e2;
import com.aspose.slides.internal.w8.a3;
import com.aspose.slides.internal.w8.b3;
import com.aspose.slides.internal.w8.e9;
import com.aspose.slides.internal.w8.f0;
import com.aspose.slides.internal.w8.f5;
import com.aspose.slides.internal.w8.j4;
import com.aspose.slides.internal.w8.j5;
import com.aspose.slides.internal.w8.k7;
import com.aspose.slides.internal.w8.m1;
import com.aspose.slides.internal.w8.o0;
import com.aspose.slides.internal.w8.o5;
import com.aspose.slides.internal.w8.p3;
import com.aspose.slides.internal.w8.t9;
import com.aspose.slides.internal.w8.v0;
import com.aspose.slides.internal.w8.v4;
import com.aspose.slides.internal.w8.w1;
import com.aspose.slides.internal.w8.w2;
import com.aspose.slides.internal.w8.y0;
import com.aspose.slides.internal.w8.y1;
import com.aspose.slides.internal.w8.z3;
import com.aspose.slides.internal.w8.z6;
import com.aspose.slides.internal.z0k.m3;
import com.aspose.slides.internal.z0k.z1;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.n1;
import com.aspose.slides.ms.System.q1;
import com.aspose.slides.ms.System.r8;
import com.aspose.slides.ms.System.s3;

public class c8 extends com.aspose.slides.internal.w5.u3 {
   private final s7 n5;
   private final com.aspose.slides.internal.j4.l6 l6;
   private final x8 k5;
   private final com.aspose.slides.internal.z5.l6 u3;
   private final com.aspose.slides.internal.j4.k5 a6;
   private static final com.aspose.slides.internal.x7n.l6 u9 = com.aspose.slides.internal.h5.n5.n5;
   private final com.aspose.slides.internal.f4.n5 h0;
   private com.aspose.slides.internal.z5.a6 c8;
   private r8 t2;
   private int s7;
   private u3 x8;
   private Stack<com.aspose.slides.internal.h6.n5> n3 = new Stack<>();
   private static final com.aspose.slides.internal.v6g.u9 y4 = new com.aspose.slides.internal.v6g.u9("image/png", "image/jpeg", "image/svg+xml");

   public c8(
      com.aspose.slides.internal.j4.l6 var1,
      s7 var2,
      com.aspose.slides.internal.z5.l6 var3,
      com.aspose.slides.internal.j4.k5 var4,
      com.aspose.slides.internal.f4.n5 var5
   ) {
      this.l6 = var1;
      if (!d1.n5(var1.n5())) {
         this.t2 = new r8(var1.n5(), 0);
      }

      this.n5 = var2;
      this.u3 = var3;
      if (var3.u3() != null) {
         this.c8 = new com.aspose.slides.internal.z5.a6(var3.u3().l6() / 2.0F, var3.u3().n5());
      } else {
         this.c8 = new com.aspose.slides.internal.z5.a6(5.0F, 4);
      }

      this.h0 = var5;
      this.k5 = new x8(this, var2, var1);
      this.a6 = var4;
      u3 var6 = new u3(this.k5);
      this.x8 = var6;
      this.n5.n5(var6);
   }

   public final com.aspose.slides.internal.f4.n5 n5() {
      return this.h0;
   }

   private void z8(com.aspose.slides.internal.w5.k5 var1) {
      if ("LEGEND".equals(var1.a6()) && "FIELDSET".equals(var1.p3().a6())) {
         t2 var8 = new t2(this);
         var8.h9("relative");
         var8.a7("true");
         var8.u9("#FFFFFF");
         t2 var9 = new t2(this, var1, null);
         this.k5.n5(var8).l6(var9);
      } else {
         switch (var1.a3().k7().h0()) {
            case 0:
               if (var1.a3().a3() == 2) {
                  t2 var6 = new t2(this);
                  var6.h9("absolute");
                  var6.s2(var1.a3().s0().toString());
                  var6.n9(var1.a3().x9().toString());
                  var6.o0(var1.a3().x8().toString());
                  var6.y5(var1.a3().y2().toString());
                  this.k5.n5(var6).a6();
               }

               if (var1.a3().j4() == 1) {
                  this.k5.l6(var1);
               } else {
                  this.k5.a6(var1);
               }
               break;
            case 1:
               if ("LI".equals(var1.a6()) && var1.a3().w1() != 2) {
                  if (!var1.a3().s3().u3().h0() && var1.a3().s3().u3().c8().l6() != 0.0F) {
                     this.k5.n5(var1.a3().s3().u3().c8());
                  }

                  this.k5.n5(var1.a3().w1());
                  this.k5.u3();
               }

               this.k5.l6(var1);
               break;
            case 2:
               if (var1.a3().w1() == 2) {
                  this.k5.k5(var1);
                  this.y2(var1);
               } else {
                  if (var1.a3().a3() == 2) {
                     t2 var4 = new t2(this);
                     var4.h9("absolute");
                     var4.s2(var1.a3().s0().toString());
                     var4.n9(var1.a3().x9().toString());
                     var4.o0(var1.a3().x8().toString());
                     var4.y5(var1.a3().y2().toString());
                     this.k5.n5(var4).a6();
                  }

                  if (!var1.a3().s3().u3().h0() && var1.a3().s3().u3().c8().l6() != 0.0F) {
                     t2 var5 = new t2(this);
                     if (var1.a3().w1() != 2) {
                        var5.i9(com.aspose.slides.internal.u3.k5.n5(com.aspose.slides.internal.v6g.k5.n5(z7.class), var1.a3().w1()));
                     }

                     this.k5.n5(var1.a3().s3().u3().c8(), var5);
                  }

                  if (var1.a3().j4() == 1) {
                     this.k5.l6(var1);
                  } else {
                     this.k5.a6(var1);
                  }
               }
               break;
            case 3:
               if (var1.a3().a3() == 2) {
                  t2 var2 = new t2(this);
                  var2.h9("absolute");
                  var2.s2(var1.a3().s0().toString());
                  var2.n9(var1.a3().x9().toString());
                  var2.o0(var1.a3().x8().toString());
                  var2.y5(var1.a3().y2().toString());
                  this.k5.n5(var2).a6();
               }

               this.k5.u3(var1).a6();
               break;
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
            default:
               this.k5.a6(var1);
               break;
            case 6:
               this.t2(var1);
               break;
            case 11:
               this.x8(var1);
               break;
            case 14:
               this.y4(var1);
         }

         if (var1.a3().l6() != null) {
            com.aspose.slides.internal.t9.u3 var7 = var1.a3().l6();
            if (var7.k7().h0() == 0 || var7.k7().h0() == 1) {
               k5 var3 = new k5(var1);
               if (var3.n5()) {
                  this.k5.y4().n5(var3.k5()).l6();
               }
            }
         }
      }
   }

   private void j5(com.aspose.slides.internal.w5.k5 var1) {
      if ("LEGEND".equals(var1.a6()) && "FIELDSET".equals(var1.p3().a6())) {
         this.k5.l6().l6();
      } else {
         if (var1.a3().k5() != null) {
            com.aspose.slides.internal.t9.u3 var2 = var1.a3().k5();
            if (var2.k7().h0() == 0 || var2.k7().h0() == 1) {
               k5 var3 = new k5(var1);
               if (var3.l6()) {
                  this.k5.y4().n5(var3.u3()).l6();
               }
            }
         }

         switch (var1.a3().k7().h0()) {
            case 0:
               this.k5.l6();
               if (var1.a3().a3() == 2) {
                  this.k5.l6().l6();
               }
               break;
            case 1:
               this.k5.l6();
               if ("LI".equals(var1.a6()) && var1.a3().w1() != 2) {
                  this.k5.l6().l6();
                  if (!var1.a3().s3().u3().h0() && var1.a3().s3().u3().c8().l6() != 0.0F) {
                     this.k5.n5(var1.a3().s3().u3().c8());
                  }
               }
               break;
            case 2:
               if (var1.a3().w1() == 2) {
                  this.k5();
                  this.k5.l6();
               } else {
                  this.k5.l6();
                  if (!var1.a3().s3().l6().h0() && var1.a3().s3().l6().c8().l6() != 0.0F) {
                     t2 var4 = new t2(this);
                     if (var1.a3().w1() != 2) {
                        var4.i9(com.aspose.slides.internal.u3.k5.n5(com.aspose.slides.internal.v6g.k5.n5(z7.class), var1.a3().w1()));
                     }

                     this.k5.n5(var1.a3().s3().l6().c8(), var4);
                  }

                  if (var1.a3().a3() == 2) {
                     this.k5.l6().l6();
                  }
               }
               break;
            case 3:
               this.k5.l6().l6();
               if (var1.a3().a3() == 2) {
                  this.k5.l6().l6();
               }
               break;
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
            default:
               this.k5.l6();
               break;
            case 6:
               this.s7(var1);
               break;
            case 11:
               this.n3(var1);
               break;
            case 14:
               this.e2(var1);
         }
      }
   }

   private void w1(com.aspose.slides.internal.w5.k5 var1) {
      label167:
      switch (var1.a3().k7().h0()) {
         case 0:
            if (this.s7 != 0 && var1.p3() != null && ("OL".equals(var1.p3().a6()) || "UL".equals(var1.p3().a6()))) {
               t2 var6 = new t2(this);
               var6.x0("0");
               t2 var11 = new t2(this);
               t2 var15 = new t2(this);
               var11.g7("label-end()");
               var15.x0("body-start()");
               var11.e0("right");
               this.k5.k5(var6).u3(var11).l6().a6(var15).u3().a6();
            }

            if (var1.a3().a3() == 2) {
               t2 var7 = new t2(this);
               r4 var12 = var1.d5();
               if (var12 != null && var12.n3() == 3 && d1.l6(var12.e5()).length() == 0) {
                  var12 = var12.d5();
               }

               if (var12 != null && var12.n3() == 1) {
                  com.aspose.slides.internal.w5.k5 var16 = com.aspose.slides.internal.v6g.k5.n5(var12, com.aspose.slides.internal.w5.k5.class);
                  if (var16 != null && var16.a3().k7().h0() == 0) {
                     var7.h9("inlineabsolute");
                  } else {
                     var7.h9("absolute");
                  }
               } else {
                  var7.h9("absolute");
               }

               var7.s2(var1.a3().s0().toString());
               var7.n9(var1.a3().x9().toString());
               var7.o0(var1.a3().x8().toString());
               var7.y5(var1.a3().y2().toString());
               this.k5.n5(var7).a6();
            }

            if (!var1.a3().a0().c8() && var1.a3().a0().h0().n5() != 1) {
               e2 var8 = new e2(var1.a3().a0().h0().l6() / 2.0F, var1.a3().a0().h0().n5());
               t2 var13 = new t2(this);
               var13.x8(var8.toString());
               var13.p6("0");
               t2 var17 = new t2(this);
               var17.r8("0");
               this.k5.h0(var13).c8(var17).l6().l6();
            }

            this.k5.a6(var1);
            break;
         case 1:
            if (var1.a3().w1() != 2) {
               this.k5.u3().a6().n5(var1.a3().w1());
            }

            if (var1.p3() == null || var1.p3().n3() != 1 || var1.p3().a3().k7().h0() != 0) {
               this.k5.n5(var1).a6();
            } else if (var1.t4() == null) {
               this.k5.l6(var1);
               if ((var1.a0() == null || var1.a0() != null && var1.a0().n3() == 3 && ((d5)var1.a0()).k5()) && var1.t4(var1.s7())) {
                  this.k5.l6("&nbsp;");
               }
            } else {
               com.aspose.slides.internal.w5.k5 var5 = this.n5((com.aspose.slides.internal.f5.z3)(var1));
               if ("SPAN".equals(var1.p3().a6()) && (var5 == null || !"HR".equals(var5.a6()))) {
                  t2 var10 = new t2(this, var1, this.l6);
                  if (!var1.a3().s3().n5().h0() && "P".equals(var1.a6())) {
                     e2 var4 = new e2(var1.a3().s3().n5().c8().l6() / 2.0F, var1.a3().s3().n5().c8().n5());
                     var10.t3(var4.toString());
                  }

                  if (!var1.a3().s3().k5().h0() && "P".equals(var1.a6())) {
                     e2 var14 = new e2(var1.a3().s3().k5().c8().l6() / 2.0F, var1.a3().s3().k5().c8().n5());
                     var10.u5(var14.toString());
                  }

                  this.k5.n3().l6(var10);
               } else {
                  this.k5.l6(var1);
               }

               if ("P".equals(var1.a6())
                  && var1.a0() != null
                  && (var1.a0().n3() == 1 || var1.a0().n3() == 3 && ((d5)var1.a0()).k5())
                  && ("B".equals(var1.t4().a6()) || "STRONG".equals(var1.t4().a6()))) {
                  this.k5.a6().l6("&nbsp;").l6();
               }
            }
            break;
         case 2:
            this.k5.c8();
            this.y2(var1);
            break;
         case 3:
            this.k5.u3(var1).a6();
            break;
         case 4:
         case 5:
         default:
            this.k5.a6(var1);
            break;
         case 6:
            if ("TABLE".equals(var1.a6())) {
               this.t2(var1);
            } else if (var1.t4() != null) {
               switch (((com.aspose.slides.internal.w5.k5)var1.t4()).a3().k7().h0()) {
                  case 8:
                  case 9:
                  case 10:
                  case 11:
                  case 12:
                  case 13:
                  case 14:
                  case 15:
                     this.t2(var1);
                     break label167;
                  default:
                     t2 var2 = new t2(this, var1, null);
                     t2 var3 = new t2(this);
                     var3.n7(var2.y4());
                     var3.l5(var2.e2());
                     var3.u2(var2.t9());
                     var3.y6(var2.n3());
                     var2.n7(d1.n5);
                     var2.l5(d1.n5);
                     var2.u2(d1.n5);
                     var2.y6(d1.n5);
                     this.k5.t2(var2).t4().q0().n3(var3).a6();
               }
            } else if (com.aspose.slides.internal.v6g.k5.l6(var1.a0(), d5.class)) {
               this.k5.l6(var1);
            }
            break;
         case 7:
            if ("TABLE".equals(var1.a6()) || var1.k7() != 0L) {
               this.t2(var1);
            } else if (com.aspose.slides.internal.v6g.k5.l6(var1.a0(), d5.class)) {
               this.k5.a6(var1);
            }
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
            break;
         case 15:
            this.k5.n5(var1).a6();
      }

      if (new k5(var1).n5()) {
         com.aspose.slides.internal.w5.k5 var9 = (com.aspose.slides.internal.w5.k5)var1.y4().a6("pseudo");
         var9.n5(null, var1.n5("before"));
         this.n5(var9, var1.a3().l6(), var1);
      }
   }

   private void n5(com.aspose.slides.internal.w5.k5 var1, IGenericList<e2$n5> var2) {
      IGenericEnumerator var3 = var2.iterator();

      try {
         while (var3.hasNext()) {
            e2$n5 var4 = (e2$n5)var3.next();
            switch (var4.n5()) {
               case 0:
               case 2:
               case 3:
               case 4:
               case 5:
                  this.k5.n5(var4.k5());
                  break;
               case 1:
                  t2 var5 = new t2(this);
                  var5.v6(var4.l6().toString());
                  var5.t6("non-uniform");
                  this.k5.u3(var1, var5).l6();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   private void r4(com.aspose.slides.internal.w5.k5 var1) {
      if (new k5(var1).l6()) {
         com.aspose.slides.internal.w5.k5 var2 = (com.aspose.slides.internal.w5.k5)var1.y4().a6("pseudo");
         var2.n5(null, var1.n5("after"));
         this.n5(var2, var1.a3().k5(), var1);
      }

      switch (var1.a3().k7().h0()) {
         case 0:
            this.k5.l6();
            if (var1.a3().a3() == 2) {
               this.k5.l6().l6();
            }

            if (!var1.a3().a0().c8() && var1.a3().a0().h0().n5() != 1) {
               e2 var6 = new e2(var1.a3().a0().h0().l6() / 2.0F, var1.a3().a0().h0().n5());
               t2 var3 = new t2(this);
               var3.x8("-" + var6);
               var3.p6("0");
               t2 var4 = new t2(this);
               var4.r8("0");
               this.k5.h0(var3).c8(var4).l6().l6();
            }

            if (this.s7 != 0 && var1.p3() != null && ("OL".equals(var1.p3().a6()) || "UL".equals(var1.p3().a6()))) {
               this.k5.l6().l6().l6().l6();
            }
            break;
         case 1:
            if (var1.p3() == null || var1.p3().n3() != 1 || var1.p3().a3().k7().h0() != 0) {
               this.k5.l6().l6();
            } else if (var1.t4() == null) {
               this.k5.l6();
            } else {
               com.aspose.slides.internal.w5.k5 var5 = this.n5((com.aspose.slides.internal.f5.z3)(var1));
               if ("SPAN".equals(var1.p3().a6()) && (var5 == null || !"HR".equals(var5.a6()))) {
                  this.k5.l6().l6();
                  if (var5 != null && (var5.a3().k7().h0() == 1 || var5.a3().k7().h0() == 6)) {
                     this.k5.a6().l6();
                  }
               } else {
                  this.k5.l6();
               }
            }

            if (var1.a3().w1() != 2) {
               if ("UL".equals(var1.a6()) && this.x8.n5() <= 1) {
                  this.k5.l6().n5("&nbsp;").l6().l6();
               } else {
                  this.k5.l6().l6().l6();
               }
            }
            break;
         case 2:
            this.k5();
            this.k5.l6();
            break;
         case 3:
            this.k5.l6().l6();
            break;
         case 4:
         case 5:
         default:
            this.k5.l6();
            break;
         case 6:
            if ("TABLE".equals(var1.a6())) {
               this.s7(var1);
            } else if (var1.t4() != null) {
               switch (((com.aspose.slides.internal.w5.k5)var1.t4()).a3().k7().h0()) {
                  case 8:
                  case 9:
                  case 10:
                  case 11:
                  case 12:
                  case 13:
                  case 14:
                  case 15:
                     this.s7(var1);
                     return;
                  default:
                     this.k5.l6().l6().l6().l6().l6();
               }
            } else if (com.aspose.slides.internal.v6g.k5.l6(var1.a0(), d5.class)) {
               this.k5.l6();
            }
            break;
         case 7:
            if ("TABLE".equals(var1.a6()) || var1.k7() != 0L) {
               this.s7(var1);
            } else if (com.aspose.slides.internal.v6g.k5.l6(var1.a0(), d5.class)) {
               this.k5.l6();
            }
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
            break;
         case 15:
            this.k5.l6().l6();
      }
   }

   private void c4(com.aspose.slides.internal.w5.k5 var1) {
      t2 var2 = new t2(this);
      var2.k6("true");
      if (!var1.a3().c8().l6().t2()) {
         var2.j1("true");
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.w8.c8.class) && !var1.a3().n5(72)) {
         var2.h2(com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.w8.c8.class).j8());
      }

      if (this.n5().n5().a6() != null) {
         var2.w5("line-height");
      }

      this.k5.n5().n5(com.aspose.slides.internal.v6g.k5.n5(var1.y2(), com.aspose.slides.internal.w5.k5.class)).a6().n5(var1, var2).a6();
   }

   private void l6() {
      this.k5.l6().l6().l6().l6().l6().l6();
   }

   private static String n5(String[] var0, int var1) {
      String var2 = "auto";
      if (var0.length > var1) {
         String var3 = var0[var1];
         if (!"*".equals(var3) && var3.length() > 0) {
            var2 = var3;
         }
      }

      return var2;
   }

   @Override
   public void n5(w1 var1) {
      t2 var2 = new t2(this);
      if (!d1.n5(var1.g7())) {
         var2.i8(var1.g7());
      }

      if (!d1.n5(var1.e9())) {
         var2.l4(var1.e9());
      }

      if ("1".equals(var1.z6())) {
         var2.q0("#cccccc");
         var2.b3("1pt");
         var2.p8("solid");
         var2.i4("hidden");
      }

      this.k5.l6(var2);
      this.l6(var1.j4());
      this.k5.l6();
   }

   @Override
   public void n5(m1 var1) {
      this.c4(var1);
      String[] var2 = d1.n5(var1.j9()) ? new String[0] : d1.n5(var1.j9(), ',');
      String[] var3 = d1.n5(var1.z6()) ? new String[0] : d1.n5(var1.z6(), ',');

      for (int var4 = 0; var4 < var2.length; var4++) {
         var2[var4] = d1.l6(var2[var4]);
      }

      for (int var12 = 0; var12 < var3.length; var12++) {
         var3[var12] = d1.l6(var3[var12]);
      }

      t2 var13 = new t2(this);
      var13.i8("100%");
      var13.l4("100%");
      var13.o2("auto");
      this.k5.t2(var13).t4();
      IGenericList var5 = var1.e9();
      if (var5.size() != 0) {
         int var6 = 0;

         for (int var7 = 0; var7 < q1.n5(var3.length, 1); var7++) {
            t2 var8 = new t2(this);
            var8.l4(n5(var3, var7));
            this.k5.s7(var8);

            for (int var9 = 0; var9 < q1.n5(var2.length, 1); var9++) {
               t2 var10 = new t2(this);
               var10.i8(n5(var2, var9));
               var10.q0("#cccccc");
               var10.b3("1pt");
               var10.p8("solid");
               var10.f4("1");
               var10.y9("1");
               t2 var11 = new t2(this);
               this.k5.n3(var10).l6(var11);
               this.l6(((z3)var5.get_Item(var6)).v3());
               this.k5.l6().l6();
               if (var5.size() == ++var6) {
                  break;
               }
            }

            this.k5.l6();
            if (var5.size() == var6) {
               break;
            }
         }
      }
   }

   private void l6(t9 var1) {
      if (var1 != null) {
         com.aspose.slides.internal.w8.c8 var2 = var1.p3();
         if (var2 != null) {
            this.k5.n5(var2).a6();
            IGenericEnumerator var3 = var2.y1().iterator();

            try {
               while (var3.hasNext()) {
                  r4 var4 = (r4)var3.next();
                  com.aspose.slides.internal.w5.k5 var5 = com.aspose.slides.internal.v6g.k5.n5(var4, com.aspose.slides.internal.w5.k5.class);
                  if (var5 != null) {
                     var5.n5(this);
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
                  var3.dispose();
               }
            }

            this.k5.l6().l6();
         } else {
            m1 var9 = var1.x9();
            if (var9 != null) {
               var9.n5(this);
            }
         }
      }
   }

   @Override
   public void l6(m1 var1) {
      this.k5.l6().l6();
      this.l6();
   }

   @Override
   public void n5(z3 var1) {
   }

   @Override
   public void n5(j5 var1) {
      this.k5.n5(this.u3, var1);
   }

   @Override
   public void l6(j5 var1) {
      this.k5.k5();
   }

   @Override
   public void n5(com.aspose.slides.internal.w8.c8 var1) {
      this.c4(var1);
   }

   @Override
   public void l6(com.aspose.slides.internal.w8.c8 var1) {
      boolean var2 = false;
      boolean var3 = false;

      for (r4 var4 = var1.a0(); var4 != null; var4 = var4.s3()) {
         if (var4.n3() == 3 && d1.l6(var4.e5()).length() != 0) {
            var2 = true;
         } else if (var4.n3() == 1) {
            com.aspose.slides.internal.w5.k5 var5 = com.aspose.slides.internal.v6g.k5.n5(var4, com.aspose.slides.internal.w5.k5.class);
            if (var5 != null) {
               if (var5.a3().w1() == 2) {
                  var2 = true;
                  break;
               }

               var3 = true;
            }
         }
      }

      if (var3 && !var2) {
         this.k5.n5("&nbsp;");
      }

      this.l6();
   }

   @Override
   public void h0(com.aspose.slides.internal.w5.k5 var1) {
      this.w1(var1);
   }

   @Override
   public void c8(com.aspose.slides.internal.w5.k5 var1) {
      this.r4(var1);
   }

   public final void n5(t9 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("document");
      }

      var1.n5(this);
   }

   @Override
   public void n5(a3 var1) {
   }

   @Override
   public void n5(c4 var1) {
      this.k5.n5(var1.n5());
   }

   @Override
   public void n5(com.aspose.slides.internal.w8.l6 var1) {
      t2 var2 = new t2(this);
      if (var1.t2("href")) {
         var2.j4(var1.o5());
      }

      this.k5.k5(var1, var2);
      if (var1.a3().k7().h0() == 1 && this.x8.n5() != 1) {
         this.n3.push(var1);
         this.w1(var1);
      }
   }

   @Override
   public void l6(com.aspose.slides.internal.w8.l6 var1) {
      if (this.n3.size() != 0 && var1 == this.n3.peek()) {
         this.r4(var1);
         this.n3.pop();
      }

      this.k5.l6();
   }

   @Override
   public void k5(com.aspose.slides.internal.w5.k5 var1) {
      this.z8(var1);
   }

   @Override
   public void u3(com.aspose.slides.internal.w5.k5 var1) {
      this.j5(var1);
   }

   @Override
   public void a6(com.aspose.slides.internal.w5.k5 var1) {
      this.z8(var1);
   }

   @Override
   public void u9(com.aspose.slides.internal.w5.k5 var1) {
      this.j5(var1);
   }

   @Override
   public void n5(f0 var1) {
      this.z8(var1);
   }

   @Override
   public void l6(f0 var1) {
      this.j5(var1);
   }

   @Override
   public void n5(v0 var1) {
      t2 var2 = new t2(this);
      var2.i0("false");
      var2.b2(var1.a3().p6() == 1 ? "wrap" : "no-wrap");
      var2.b5("preserve");
      var2.b4("preserve");
      this.k5.l6(var1, var2);
   }

   @Override
   public void n5(com.aspose.slides.internal.w8.r4 var1) {
      if (var1.a3().w1() != 2) {
         this.k5.n5(var1.a3().w1()).u3().a6();
      } else if (var1.a3().k7().h0() == 1) {
         this.k5.z1().t4().q0().m1().a6();
         this.k5.n5("line-height", "0");
      }

      String var2 = this.n5(var1.v3());
      if (d1.n5(var2)) {
         this.k5.a6(var1).n5(var1.e9()).l6();
      } else {
         t2 var3 = new t2(this);
         var3.v6(var2);
         var3.t6("non-uniform");
         if (var1.t2("width") && !var1.a3().n5(285)) {
            var3.x9(d1.n5(new String[]{n1.u9(var1.i9()), "px"}));
         }

         if (var1.t2("height") && !var1.a3().n5(142)) {
            var3.p3(d1.n5(new String[]{n1.u9(var1.j8()), "px"}));
         }

         this.k5.u3(var1, var3).l6();
      }

      if (var1.a3().w1() != 2) {
         this.k5.l6().l6().l6();
      } else if (var1.a3().k7().h0() == 1) {
         this.k5.l6().l6().l6().l6().l6();
      }
   }

   @Override
   public boolean n5(o0 var1) {
      String var2 = "image/png";
      String var3 = "image/jpeg";
      String var4 = "image/svg+xml";
      if (d1.n5(var1.p6()) && !d1.n5(var1.v3())) {
         String var5 = d1.l6(d1.a6(var1.v3()));
         if (d1.k5(var5, ".png")) {
            var1.s3("image/png");
         }

         if (d1.k5(var5, ".jpg") || d1.k5(var5, ".jpeg")) {
            var1.s3("image/jpeg");
         }
      }

      switch (y4.n5(d1.a6(var1.p6()))) {
         case 0:
         case 1:
            if (var1.v3() != null) {
               String var21 = this.n5(var1.v3());
               com.aspose.slides.internal.j4.a6 var22 = this.a6.n5(this, new com.aspose.slides.internal.j4.u3(var21));
               if (var22.l6() == null && var22.n5() != null) {
                  t2 var23 = new t2(this);
                  var23.v6(this.n5(var1.v3()));
                  var23.t6("non-uniform");
                  if (var1.h6() != null) {
                     var23.x9(d1.n5(new String[]{var1.h6(), "px"}));
                  }

                  if (var1.j4() != null) {
                     var23.p3(d1.n5(new String[]{var1.j4(), "px"}));
                  }

                  this.k5.u3(var1, var23).l6();
                  return true;
               }

               return false;
            }
            break;
         case 2:
            if (var1.v3() != null) {
               String var20 = this.n5(var1.v3());
               com.aspose.slides.internal.j4.a6 var6 = this.a6.n5(this, new com.aspose.slides.internal.j4.u3(var20));
               if (var6.l6() == null && var6.n5() != null) {
                  com.aspose.slides.internal.l7h.j5 var7 = var6.k5();
                  if (var7 == null) {
                     var7 = com.aspose.slides.internal.l7h.j5.u3(1252);
                  }

                  com.aspose.slides.internal.l7h.j5 var8 = var7;
                  com.aspose.slides.internal.z0k.e2 var9 = new com.aspose.slides.internal.z0k.e2(var6.n5());

                  try {
                     m3 var10 = new m3(var9, var8);

                     try {
                        String var11 = var10.c8();
                        this.k5.e2().n5("base-dir", z1.u9(var20)).l6(var11).l6();
                     } finally {
                        if (var10 != null) {
                           var10.dispose();
                        }
                     }
                  } finally {
                     if (var9 != null) {
                        var9.dispose();
                     }
                  }

                  return true;
               }

               return false;
            }
      }

      return false;
   }

   @Override
   public void l6(o0 var1) {
   }

   @Override
   public void n5(com.aspose.slides.internal.c2.k5 var1) {
      this.k5.e2().l6(var1.z1()).l6();
   }

   private void n5(com.aspose.slides.internal.w5.k5 var1, com.aspose.slides.internal.t9.u3 var2, com.aspose.slides.internal.w5.k5 var3) {
      switch (var2.k7().h0()) {
         case 0:
         case 3:
         case 7:
            this.k5.a6(var1);
            this.n5(var1, var2.z1().t2());
            this.k5.l6();
            break;
         case 1:
         case 6:
         case 8:
         case 9:
         case 10:
         case 11:
         case 14:
         case 15:
            this.k5.n5(var1).a6();
            this.n5(var1, var2.z1().t2());
            this.k5.l6().l6();
            break;
         case 2:
            var3.k5(var1);
            c4 var4 = var3.y4().u9(var2.z1().u3());
            var1.u3(var4);
            var1.n5(this);
            var3.l6(var1);
         case 4:
         case 5:
         case 12:
         case 13:
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.w8.a6 var1) {
      if (new k5(var1).n5()) {
         com.aspose.slides.internal.w5.k5 var2 = (com.aspose.slides.internal.w5.k5)var1.y4().a6("pseudo");
         var2.n5(null, var1.n5("before"));
         this.n5(var2, var1.a3().l6(), var1);
      } else {
         this.k5.a6();
         if (var1.y2().n3() == 1 && ((com.aspose.slides.internal.w5.k5)var1.y2()).a3().k7().h0() != 0) {
            com.aspose.slides.internal.w5.k5 var3 = com.aspose.slides.internal.v6g.k5.n5(var1.z3(), com.aspose.slides.internal.w5.k5.class);
            if (com.aspose.slides.internal.v6g.k5.l6(var1.p3(), com.aspose.slides.internal.w8.c8.class) && var1.d5() == null) {
               this.k5.l6("&nbsp;");
            } else if (var1.s3() == null && var1.d5() == null) {
               this.k5.l6("&nbsp;");
            } else if (var1.d5() == null && var1.m1() != null && ((com.aspose.slides.internal.w5.k5)var1.m1()).a3().k7().h0() == 0) {
               this.k5.l6("&nbsp;");
            } else if (var1.s3() != null
               && var1.s3().n3() == 3
               && d1.l6(var1.s3().e5()).length() == 0
               && var1.m1() != null
               && var1.m1().n3() == 1
               && d1.u3(var1.m1().t2(), "BR", (short)5)) {
               this.k5.l6("&nbsp;");
            } else if (var1.s3() != null && var1.s3().n3() == 1 && d1.u3(var1.s3().t2(), "BR", (short)5)) {
               this.k5.l6("&nbsp;");
            } else if (var1.m1() != null && ((com.aspose.slides.internal.w5.k5)var1.m1()).a3().k7().h0() == 1) {
               this.k5.l6("&nbsp;");
            } else if (var1.m1() == null || !"TABLE".equals(var1.m1().a6()) || var3 == null || var3.a3().k7().h0() == 0 && !"BR".equals(var3.a6())) {
               if (var1.z3() != null && "TABLE".equals(var1.z3().a6())) {
                  this.k5.l6("&nbsp;");
               }
            } else {
               this.k5.l6("&nbsp;");
            }
         } else if (var1.m1() != null && "TABLE".equals(var1.m1().a6())) {
            this.k5.l6("&nbsp;");
         } else if (var1.z3() != null && "TABLE".equals(var1.z3().a6())) {
            this.k5.l6("&nbsp;");
         } else if (((com.aspose.slides.internal.w5.k5)var1.y2()).a3().k7().h0() == 0) {
            if (var1.m1() == null || !"BR".equals(var1.m1().a6()) || com.aspose.slides.internal.v6g.k5.l6(var1.s3(), d5.class) && !((d5)var1.s3()).k5()) {
               if (var1.z3() != null && ((com.aspose.slides.internal.w5.k5)var1.z3()).a3().k7().h0() == 1) {
                  this.k5.l6("&nbsp;");
               } else if (var1.d5() == null
                  && var1.s3() == null
                  && var1.p3().m1() != null
                  && ((com.aspose.slides.internal.w5.k5)var1.p3().m1()).a3().k7().h0() == 0) {
                  this.k5.l6("&nbsp;");
               } else if (var1.d5() == null && var1.p3().z3() != null && "BR".equals(var1.p3().z3().a6())) {
                  this.k5.l6("&nbsp;");
               } else if (var1.d5() == null && var1.p3().z3() == null && com.aspose.slides.internal.v6g.k5.l6(var1.s3(), d5.class) && !((d5)var1.s3()).k5()) {
                  this.k5.l6("&nbsp;");
               }
            } else {
               this.k5.l6("&nbsp;");
            }
         }

         this.k5.k5();
      }

      if (new k5(var1).l6()) {
         com.aspose.slides.internal.w5.k5 var4 = (com.aspose.slides.internal.w5.k5)var1.y4().a6("pseudo");
         var4.n5(null, var1.n5("after"));
         this.n5(var4, var1.a3().k5(), var1);
      }
   }

   @Override
   public void n5(b3 var1) {
      this.k5.k5(var1);
      this.s7++;
   }

   @Override
   public void l6(b3 var1) {
      this.k5.l6();
      this.s7--;
   }

   @Override
   public void n5(f5 var1) {
      this.k5.k5(var1);
      this.s7++;
   }

   @Override
   public void l6(f5 var1) {
      this.k5.l6();
      this.s7--;
   }

   @Override
   public void n5(y1 var1) {
      this.y2(var1);
   }

   @Override
   public void l6(y1 var1) {
      this.k5();
   }

   private void y2(com.aspose.slides.internal.w5.k5 var1) {
      t2 var2 = new t2(this);
      t2 var3 = new t2(this);
      if (var1.a3().d5().l6() == 0) {
         var2.g7("label-end()");
      }

      int var4 = 1;
      String var5 = d1.n5;
      if (com.aspose.slides.internal.v6g.k5.l6(var1.p3(), b3.class)) {
         b3 var6 = com.aspose.slides.internal.v6g.k5.n5(var1.p3(), b3.class);
         var4 = var6.z6();
         var5 = var6.o5();
      }

      com.aspose.slides.internal.w5.k5 var13 = var1;

      while (var13.z3() != null) {
         var13 = com.aspose.slides.internal.v6g.k5.n5(var13.z3(), com.aspose.slides.internal.w5.k5.class);
         if (var13.a3().k7().h0() == 2) {
            var4++;
         }
      }

      t2 var7 = new t2(this);
      var7.x0("0");
      t2 var8 = new t2(this, var1, null);
      t2 var9 = new t2(this);
      var9.u5(var8.c8());
      var9.w8(var8.t2());
      var9.c2(var8.s7());
      var9.t3(var8.x8());
      var9.i1(var8.n5());
      var9.f2("transparent");
      var9.e5(var8.l6());
      var9.p6(var8.a6());
      var9.h2(var8.k5());
      if ("PSEUDO".equals(var1.a6()) && var1.p3().a3().k7().h0() == 2) {
         var9.w8("-24pt");
      } else {
         var3.x0("body-start()");
         var2.e0("right");
      }

      this.k5.k5(var7).u3(var2).n5(var9, false);
      if (var1.a3().d5().l6() == 1) {
         this.k5.l6().l6().a6(var3).u3().a6().n5(var8).a6();
      }

      if (var1.a3().d5().k5() != 14) {
         if (var1.a3().d5().n5().t2()) {
            String var10;
            if (!d1.a6(var5, d1.n5) && !d1.a6(var5, "decimal")) {
               var10 = var5;
            } else {
               var10 = com.aspose.slides.internal.u3.k5.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.m3.f5.class), var1.a3().d5().k5());
            }

            com.aspose.slides.internal.t9.n5 var11 = var1.x9().h0().n5(var10);
            if (var11 != null) {
               String var12 = var11.u9().n5(var4);
               if (var11.l6() == 1 || var11.l6() == 2 || var11.l6() == 5 || var11.l6() == 4) {
                  var12 = d1.n5(new String[]{var12, "."});
               }

               this.k5.n5(var12);
            }
         } else {
            String var14 = this.n5(var1.a3().d5().n5().h0());
            t2 var15 = new t2(this);
            var15.v6(var14);
            var15.t6("non-uniform");
            this.k5.u3(var1, var15).l6();
         }
      }

      if (var1.a3().d5().l6() != 1) {
         this.k5.l6().l6().a6(var3).u3().a6().n5(var8).a6();
      }
   }

   private void k5() {
      this.k5.l6().l6().l6().l6().l6().l6();
   }

   @Override
   public void n5(com.aspose.slides.internal.w8.n3 var1) {
      this.k5.l6(var1);
   }

   @Override
   public void l6(com.aspose.slides.internal.w8.n3 var1) {
      this.k5.l6();
   }

   @Override
   public com.aspose.slides.internal.w5.a6 t2(com.aspose.slides.internal.w5.k5 var1) {
      com.aspose.slides.internal.w5.k5 var2 = var1.p3();
      if (var2 != null && var2.a3().k7().h0() == 0) {
         this.k5.n5(" ").n3().a6();
      }

      if (var1.a3().a3() == 2) {
         t2 var3 = new t2(this);
         var3.h9(s3.n5(b5.class, var1.a3().a3()));
         var3.y5(var1.a3().y2().toString());
         var3.n9(var1.a3().x9().toString());
         var3.s2(var1.a3().s0().toString());
         var3.o0(var1.a3().x8().toString());
         this.k5.n5(var3).a6();
      }

      a6 var4 = new a6(this, var1, this, this.k5);
      var4.n5();
      if (var1.a3().a3() == 2) {
         this.k5.l6().l6();
      }

      if (var2 != null && var2.a3().k7().h0() == 0) {
         this.k5.l6().l6();
         if (var1.m1() != null) {
            this.k5.a6().l6();
         } else if ("A".equals(var2.a6())) {
            this.k5.a6().l6("&nbsp;").l6();
         }
      }

      return new com.aspose.slides.internal.q1.n5();
   }

   @Override
   public void n5(e9 var1) {
      t2 var2 = new t2(this);
      if (var1.a3().f5() != null) {
         var2.a3(var1.a3().f5().toString());
      }

      this.k5.x8(var2);
   }

   @Override
   public void l6(e9 var1) {
      this.k5.l6();
   }

   @Override
   public void n5(y0 var1) {
      this.k5.n5(var1).a6();
   }

   @Override
   public void l6(y0 var1) {
      this.k5.l6().l6();
   }

   @Override
   public void y4(com.aspose.slides.internal.w5.k5 var1) {
      t2 var2 = new t2(this);
      z6 var3 = com.aspose.slides.internal.v6g.k5.n5(var1, z6.class);
      if (var3 != null) {
         var2.f4(com.aspose.slides.ms.System.a3.l6(var3.v8()));
         int var4 = var3.i9();
         if (var4 > 1) {
            w2 var5 = com.aspose.slides.internal.v6g.k5.n5(var3.p3(), w2.class);
            int var6 = var5.j9();
            com.aspose.slides.internal.w5.k5 var7 = var5.p3();
            o5 var8 = null;

            while (var1 != null) {
               var8 = com.aspose.slides.internal.v6g.k5.n5(var7, o5.class);
               if (var8 != null) {
                  break;
               }

               var7 = var7.p3();
            }

            if (var8 != null) {
               int var9 = var8.o5().n5();
               int var10 = var9 - var6;
               if (var4 > var10) {
                  var4 = var10;
               }
            } else {
               var4 = 1;
            }
         }

         var2.y9(com.aspose.slides.ms.System.a3.l6(var4));
      }

      this.k5.h0(var1, var2).a6();
      if (new k5(var1).n5()) {
         com.aspose.slides.internal.w5.k5 var11 = (com.aspose.slides.internal.w5.k5)var1.y4().a6("pseudo");
         var11.n5(null, var1.n5("before"));
         this.n5(var11, var1.a3().l6(), var1);
      }
   }

   @Override
   public void e2(com.aspose.slides.internal.w5.k5 var1) {
      if (new k5(var1).l6()) {
         com.aspose.slides.internal.w5.k5 var2 = (com.aspose.slides.internal.w5.k5)var1.y4().a6("pseudo");
         var2.n5(null, var1.n5("after"));
         this.n5(var2, var1.a3().k5(), var1);
      }

      this.k5.l6().l6();
   }

   @Override
   public void t9(com.aspose.slides.internal.w5.k5 var1) {
      t2 var2 = new t2(this);
      String var3 = var1.u3("rowspan");
      if (var3 != null) {
         var2.y9(var3);
      }

      var3 = var1.u3("colspan");
      if (var3 != null) {
         var2.f4(var3);
      }

      this.k5.h0(var1, var2).l6(var2);
   }

   @Override
   public void z1(com.aspose.slides.internal.w5.k5 var1) {
      this.k5.l6().l6();
   }

   @Override
   public void n5(com.aspose.slides.internal.w8.c4 var1) {
      if (var1.a3().a3() == 2) {
         t2 var2 = new t2(this);
         var2.h9("absolute");
         var2.s2(var1.a3().s0().toString());
         var2.n9(var1.a3().x9().toString());
         var2.o0(var1.a3().x8().toString());
         var2.y5(var1.a3().y2().toString());
         this.k5.n5(var2).a6();
      }

      this.u3();
      t2 var13 = new t2(this);
      var13.y0("button");
      var13.s0("central");
      String var3 = var1.s4();
      if (d1.n5(var3)) {
         var3 = " ";
      }

      boolean var4 = var1.p6() != null && d1.u3("file", var1.p6(), (short)5);
      if (var4) {
         var3 = "Choose File";
      }

      com.aspose.slides.internal.u4.n5 var5 = new com.aspose.slides.internal.u4.n5(var1);
      f2 var6 = com.aspose.slides.internal.w3.a6.n5().n5(var3, var5.k5(), var5.l6(), var5.n5()).a6();
      var6.l6(var5.l6());
      var6.n5((float)q1.l6((double)(var6.l6() + 12.0F)));
      if (!var1.a3().f5().h0() && !var4) {
         var13.o5(var1.a3().f5().toString());
      } else {
         var13.o5(n1.n5(var6.l6(), u9));
      }

      float var7 = (float)q1.l6((double)com.aspose.slides.internal.w3.u3.k5(var6.k5()));
      e2 var8;
      if (var1.a3().c4().h0()) {
         var8 = new e2(var7, 4);
      } else {
         var8 = new e2(var1.a3().c4().c8().l6(), var1.a3().c4().c8().n5());
      }

      var13.j9(new e2(var8.l6(), var8.n5()).toString());
      var8 = new e2(var8.l6() / 2.0F, var8.n5());
      t2 var9 = new t2(this);
      var9.r8(var13.u3());
      this.k5.a6(var1, var13).c8(var9).l6();
      t2 var10 = new t2(this);
      var10.x8(var8.toString());
      var10.p6("0");
      var9.r8("0");
      this.k5.h0(var10).c8(var9).l6().l6();
      var10 = new t2(this);
      var10.x8("-" + var8);
      var10.p6("0");
      var9.r8("0");
      this.k5.h0(var10).c8(var9).l6().l6();
      t2 var11 = new t2(this);
      var11.z6("true");
      var11.p6("0");
      this.k5.h0(var11).n5(com.aspose.slides.internal.w3.l6.n5(var3)).l6();
      t2 var12 = new t2(this);
      var12.y0("end");
      var9.r8("0");
      this.k5.h0(var12).c8(var9).l6().l6();
      if (var4) {
         this.k5.y4().n5("No file chosen").l6();
      }

      this.k5.l6();
      this.u3();
      if (var1.a3().a3() == 2) {
         this.k5.l6().l6();
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.w8.t2 var1) {
      this.u3();
      t2 var2 = new t2(this);
      var2.y0("button");
      var2.s0("central");
      String var3 = var1.s0();
      if (d1.n5(var3)) {
         var3 = " ";
      }

      com.aspose.slides.internal.u4.n5 var4 = new com.aspose.slides.internal.u4.n5(var1);
      f2 var5 = new f2();
      if (var4.l6() > 0.0F) {
         com.aspose.slides.internal.w3.a6.n5().n5(var3, var4.k5(), var4.l6(), var4.n5()).l6(var5);
      } else {
         f2.n5.l6(var5);
      }

      if (var1.a3().f5().h0()) {
         var2.o5(n1.n5(var5.l6(), u9));
      } else {
         var2.o5(var1.a3().f5().toString());
      }

      if (var1.a3().c4().h0()) {
         var2.j9(n1.n5(var5.k5(), u9));
      } else {
         var2.j9(var1.a3().c4().toString());
      }

      t2 var6 = new t2(this);
      var6.r8(var2.u3());
      this.k5.a6(var1, var2).c8(var6).l6();
      t2 var7 = new t2(this);
      var7.x8("10pt");
      var7.p6("0");
      var6.r8("0");
      this.k5.h0(var7).c8(var6).l6().l6();
      var7 = new t2(this);
      var7.x8("-10pt");
      var7.p6("0");
      var6.r8("0");
      this.k5.h0(var7).c8(var6).l6().l6();
      t2 var8 = new t2(this);
      var8.z6("true");
      var8.p6("0");
      this.k5.h0(var8).n5(com.aspose.slides.internal.w3.l6.n5(var3)).l6();
      t2 var9 = new t2(this);
      var9.y0("content");
      this.k5.h0(var9);
      var1.l6(this);
      this.k5.l6();
      t2 var10 = new t2(this);
      var10.y0("end");
      var6.r8("0");
      this.k5.h0(var10).c8(var6).l6().l6();
      this.k5.l6();
      this.u3();
   }

   @Override
   public void t4(com.aspose.slides.internal.w8.c4 var1) {
      this.u3();
      t2 var2 = new t2(this);
      var2.y0("radiobutton");
      var2.s0("central");
      String var3 = var1.s4();
      if (d1.n5(var3)) {
         var3 = " ";
      }

      if (var1.a3().f5().h0()) {
         var2.o5(this.u3.u3().toString());
      } else {
         var2.o5(var1.a3().f5().toString());
      }

      t2 var4 = new t2(this);
      if (var1.a3().f5().h0()) {
         var2.o5(this.u3.u3().toString());
         var4.r8(new com.aspose.slides.internal.z5.a6(this.u3.u3().l6(), this.u3.u3().n5()).toString());
      } else {
         var2.o5(var1.a3().f5().toString());
         var4.r8(new e2(var1.a3().f5().c8().l6(), var1.a3().f5().c8().n5()).toString());
      }

      if (var1.a3().c4().h0()) {
         var2.j9(this.u3.u3().toString());
      } else {
         var2.j9(var1.a3().c4().toString());
      }

      this.k5.a6(var1, var2).c8(var4).l6();
      t2 var5 = new t2(this);
      var5.x8(this.c8.toString());
      var5.p6("0");
      var4.r8("0");
      this.k5.h0(var5).c8(var4).l6().l6();
      var5 = new t2(this);
      var5.x8("-" + this.c8);
      var5.p6("0");
      var4.r8("0");
      this.k5.h0(var5).c8(var4).l6().l6();
      t2 var6 = new t2(this);
      var6.e9(var1.v8() ? "true" : "false");
      var6.p6("0");
      this.k5.h0(var6).n5(com.aspose.slides.internal.w3.l6.n5(var3)).l6();
      var6 = new t2(this);
      var6.z6("true");
      var6.p6("0");
      this.k5.h0(var6).n5(com.aspose.slides.internal.w3.l6.n5(var3)).l6();
      t2 var7 = new t2(this);
      var7.y0("end");
      var4.r8("0");
      this.k5.h0(var7).c8(var4).l6().l6();
      this.k5.l6();
      this.u3();
   }

   @Override
   public void n5(com.aspose.slides.internal.w8.z1 var1) {
      this.w1(var1);
   }

   @Override
   public void l6(com.aspose.slides.internal.w8.z1 var1) {
      this.r4(var1);
   }

   @Override
   public void a6(com.aspose.slides.internal.w8.c4 var1) {
      this.z1(var1);
   }

   @Override
   public void z1(com.aspose.slides.internal.w8.c4 var1) {
      this.u3();
      t2 var2 = new t2(this);
      var2.y0("editbox");
      var2.s0("central");
      com.aspose.slides.internal.u4.n5 var3 = new com.aspose.slides.internal.u4.n5(var1);
      f2 var4 = com.aspose.slides.internal.w3.a6.n5().n5(var3.k5(), var3.l6(), var3.n5()).a6();
      var4.l6(var3.l6());
      var4.n5((float)q1.l6((double)var4.l6()));
      com.aspose.slides.internal.f5.n5 var5 = var1.u9("cols");
      com.aspose.slides.internal.f5.n5 var6 = var1.u9("size");
      int var7 = 1;
      int[] var8 = new int[]{1};
      boolean var9 = var5 != null && !com.aspose.slides.ms.System.a3.n5(var5.k5(), var8);
      var7 = var8[0];
      if (var9) {
         boolean var17 = true;
      } else {
         var8[0] = var7;
         boolean var10 = var6 != null && !com.aspose.slides.ms.System.a3.n5(var6.k5(), var8);
         var7 = var8[0];
         if (var10) {
            boolean var19 = true;
         }
      }

      if (var1.a3().f5().h0()) {
         var2.o5("155px");
      } else {
         var2.o5(var1.a3().f5().toString());
      }

      float var20 = (float)q1.l6((double)com.aspose.slides.internal.w3.u3.k5(var4.k5()));
      e2 var11;
      if (var1.a3().c4().h0()) {
         var2.j9(new e2(var20, 4).toString());
         var11 = new e2(var20 / 2.0F + 2.0F, 4);
      } else {
         var2.j9(var1.a3().c4().toString());
         var11 = new e2(var1.a3().c4().c8().l6() / 2.0F + 2.0F, var1.a3().c4().c8().n5());
      }

      t2 var12 = new t2(this);
      var12.r8(var2.u3());
      this.k5.a6(var1, var2).c8(var12).l6();
      t2 var13 = new t2(this);
      var13.x8(var11.toString());
      var13.p6("0");
      var12.r8("0");
      this.k5.h0(var13).c8(var12).l6().l6();
      var13 = new t2(this);
      var13.x8("-" + var11);
      var13.p6("0");
      var12.r8("0");
      this.k5.h0(var13).c8(var12).l6().l6();
      t2 var14 = new t2(this);
      var14.z6("true");
      var14.p6("0");
      this.k5.h0(var14).n5(!d1.n5(var1.s4()) ? com.aspose.slides.internal.w3.l6.n5(var1.s4()) : d1.n5).l6();
      t2 var15 = new t2(this);
      var12 = new t2(this);
      var15.y0("end");
      var12.r8("0");
      this.k5.h0(var15).c8(var12).l6().l6();
      this.k5.l6();
      this.u3();
   }

   @Override
   public void l6(com.aspose.slides.internal.w8.c4 var1) {
      this.u3();
      t2 var2 = new t2(this);
      var2.y0("checkbox");
      var2.s0("central");
      String var3 = var1.s4();
      if (d1.n5(var3)) {
         var3 = " ";
      }

      t2 var4 = new t2(this);
      if (var1.a3().f5().h0()) {
         var2.o5(this.u3.u3().toString());
         var4.r8(new com.aspose.slides.internal.z5.a6(this.u3.u3().l6(), this.u3.u3().n5()).toString());
      } else {
         var2.o5(var1.a3().f5().toString());
         var4.r8(new e2(var1.a3().f5().c8().l6(), var1.a3().f5().c8().n5()).toString());
      }

      if (var1.a3().c4().h0()) {
         var2.j9(this.u3.u3().toString());
      } else {
         var2.j9(var1.a3().c4().toString());
      }

      this.k5.a6(var1, var2).c8(var4).l6();
      t2 var5 = new t2(this);
      var5.x8(this.c8.toString());
      var5.p6("0");
      var4.r8("0");
      this.k5.h0(var5).c8(var4).l6().l6();
      var5 = new t2(this);
      var5.x8("-" + this.c8);
      var5.p6("0");
      var4.r8("0");
      this.k5.h0(var5).c8(var4).l6().l6();
      t2 var6 = new t2(this);
      var6.e9(var1.v8() ? "true" : "false");
      var6.p6("0");
      this.k5.h0(var6).n5(com.aspose.slides.internal.w3.l6.n5(var3)).l6();
      var6 = new t2(this);
      var6.z6("true");
      var6.p6("0");
      this.k5.h0(var6).n5(com.aspose.slides.internal.w3.l6.n5(var3)).l6();
      t2 var7 = new t2(this);
      var7.y0("end");
      var4.r8("0");
      this.k5.h0(var7).c8(var4).l6().l6();
      this.k5.l6();
      this.u3();
   }

   @Override
   public void n5(k7 var1) {
      String var2 = var1.a3().f5().h0() ? "100%" : var1.a3().f5().toString();
      t2 var3 = new t2(this);
      var3.r1("rule");
      var3.r8(var2);
      var3.e0(com.aspose.slides.internal.u3.k5.n5(com.aspose.slides.internal.v6g.k5.n5(q3.class), var1.a3().j9()));
      var3.a2("double");
      var3.h1("1pt");
      t2 var4 = new t2(this);
      var4.e0(var3.t4());
      var4.u5("0.5em");
      var4.t3("0.5em");
      if (new k5(var1).n5()) {
         com.aspose.slides.internal.w5.k5 var5 = (com.aspose.slides.internal.w5.k5)var1.y4().a6("pseudo");
         var5.n5(null, var1.n5("before"));
         this.n5(var5, var1.a3().l6(), var1);
      }

      if (var1.a3().k7().h0() != 0) {
         this.k5.l6(var4);
         this.k5.c8(var3).l6();
         this.k5.l6();
      }

      if (new k5(var1).l6()) {
         com.aspose.slides.internal.w5.k5 var6 = (com.aspose.slides.internal.w5.k5)var1.y4().a6("pseudo");
         var6.n5(null, var1.n5("after"));
         this.n5(var6, var1.a3().k5(), var1);
      }
   }

   @Override
   public com.aspose.slides.internal.w5.a6 n5(j4 var1) {
      this.u3();
      t2 var2 = new t2(this);
      var2.y0("editbox");
      var2.s0("central");
      com.aspose.slides.internal.u4.n5 var3 = new com.aspose.slides.internal.u4.n5(var1);
      f2 var4 = com.aspose.slides.internal.w3.a6.n5().n5(var3.k5(), var3.l6(), var3.n5()).a6();
      float var5 = (float)q1.l6((double)com.aspose.slides.internal.w3.u3.k5(var4.k5()));
      if (var1.a3().f5().h0()) {
         var2.o5(n1.n5(var4.l6() * var1.o5(), u9));
      } else {
         var2.o5(var1.a3().f5().toString());
      }

      e2 var7;
      if (var1.a3().c4().h0()) {
         float var6 = var1.v8() * var5;
         var2.j9(new e2(var6, 4).toString());
         var7 = new e2(var6 / 2.0F, 4);
      } else {
         var2.j9(var1.a3().c4().toString());
         var7 = new e2(var1.a3().c4().c8().l6() / 2.0F, var1.a3().c4().c8().n5());
      }

      t2 var16 = new t2(this);
      var16.r8(var2.u3());
      this.k5.a6(var1, var2).c8(var16).l6();
      t2 var8 = new t2(this);
      var8.x8(var7.toString());
      var8.p6("0");
      var16.r8("0");
      this.k5.h0(var8).c8(var16).l6().l6();
      var8 = new t2(this);
      var8.x8("-" + var7);
      var8.p6("0");
      var16.r8("0");
      this.k5.h0(var8).c8(var16).l6().l6();
      t2 var9 = new t2(this);
      var9.z6("true");
      var9.p6("0");
      short var10 = 8203;

      for (String var14 : d1.n5(com.aspose.slides.internal.w3.l6.n5(var1.e5()), '\n')) {
         String var15 = d1.k5(var14,new char[]{ '\r'});
         this.k5.h0(var9);
         if (var15.length() != 0) {
            this.k5.n5(var15);
         } else {
            this.k5.n5(d1.n5('\u200b', 1));
         }

         this.k5.l6();
      }

      return new com.aspose.slides.internal.q1.n5();
   }

   @Override
   public void n5(j4 var1, com.aspose.slides.internal.w5.a6 var2) {
      t2 var3 = new t2(this);
      t2 var4 = new t2(this);
      var3.y0("end");
      var4.r8("0");
      this.k5.h0(var3).c8(var4).l6().l6();
      this.k5.l6();
      this.u3();
   }

   @Override
   public com.aspose.slides.internal.w5.a6 n5(p3 var1) {
      this.u3();
      List var2 = new List();
      int var3 = -1;
      com.aspose.slides.internal.w5.k5 var4 = com.aspose.slides.internal.v6g.k5.n5(var1.t4(), com.aspose.slides.internal.w5.k5.class);

      for (z8 var6 : var1.w2()) {
         v4 var7 = (v4)var6;
         if (var7.s0()) {
            var3 = var2.size();
         }

         if (var7.a0() != null && var7.a0().n3() == 3) {
            String var8 = var7.a0().c8();
            if (var8 == null) {
               var8 = d1.n5;
            }

            String var9 = var8;
            var2.addItem(d1.k5(var9,new char[]{ '\n', '\r'}));
         } else {
            var2.addItem(d1.n5);
         }
      }

      if (var3 == -1 && var2.size() > 0) {
         var3 = 0;
      }

      t2 var16 = new t2(this);
      var16.y0("combobox");
      var16.s0("central");
      com.aspose.slides.internal.u4.n5 var17 = new com.aspose.slides.internal.u4.n5(var1);
      f2 var18 = com.aspose.slides.internal.w3.a6.n5().n5(var17.k5(), var17.l6(), var17.n5()).a6();
      var18.l6(var17.l6());
      var18.n5((float)q1.l6((double)var18.l6()));
      float var19 = (float)q1.l6((double)com.aspose.slides.internal.w3.u3.k5(var18.k5()));
      e2 var20;
      if (var1.a3().c4().h0()) {
         var16.j9(new e2(var19, 4).toString());
         var20 = new e2(var19 / 2.0F, 4);
      } else {
         var16.j9(var1.a3().c4().toString());
         var20 = new e2(var1.a3().c4().c8().l6() / 2.0F, var1.a3().c4().c8().n5());
      }

      if (!var1.a3().f5().h0()) {
         var16.o5(var1.a3().f5().toString());
      } else if (var2.size() != 0) {
         String var10 = d1.n5;
         List$Enumerator var11 = var2.iterator();

         try {
            while (var11.hasNext()) {
               String var12 = (String)var11.next();
               if (var12.length() > var10.length()) {
                  var10 = var12;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var11, IDisposable.class)) {
               var11.dispose();
            }
         }

         com.aspose.slides.internal.w3.a6.n5().n5(var10, var17.k5(), var17.l6(), var17.n5()).l6(var18);
         var18.l6(var17.l6());
         var18.n5((float)q1.l6((double)var18.l6()) + 25.0F);
         var16.o5(n1.n5(var18.l6(), u9));
      } else {
         var16.o5("25px");
      }

      t2 var21 = new t2(this);
      var21.r8(var16.u3());
      this.k5.a6(var1, var16).c8(var21).l6();
      t2 var22 = new t2(this);
      var22.x8(var20.toString());
      var22.p6("0");
      var21.r8("0");
      this.k5.h0(var22).c8(var21).l6().l6();
      var22 = new t2(this);
      var22.x8("-" + var20);
      var22.p6("0");
      var21.r8("0");
      this.k5.h0(var22).c8(var21).l6().l6();

      for (int var24 = 0; var24 < var2.size(); var24++) {
         t2 var13 = new t2(this);
         var13.z6("true");
         var13.p6("0");
         if (var24 == var3) {
            var13.e9("true");
         }

         if (d1.n5((String)var2.get_Item(var24))) {
            var2.set_Item(var24, "@{EMPTY_VALUE}");
         }

         this.k5.h0(var13).n5(com.aspose.slides.internal.w3.l6.n5((String)var2.get_Item(var24))).l6();
      }

      return new com.aspose.slides.internal.q1.n5();
   }

   @Override
   public void n5(p3 var1, com.aspose.slides.internal.w5.a6 var2) {
      t2 var3 = new t2(this);
      t2 var4 = new t2(this);
      var3.y0("end");
      var4.r8("0");
      this.k5.h0(var3).c8(var4).l6().l6();
      this.k5.l6();
      this.u3();
   }

   @Override
   public void n5(com.aspose.slides.internal.w8.u9 var1) {
      if (!d1.n5(var1.j9())) {
         r8 var2 = null;
         r8[] var3 = new r8[]{var2};
         boolean var4 = r8.n5(var1.j9(), 0, var3);
         var2 = var3[0];
         if (var4) {
            this.t2 = var2;
         }
      }
   }

   public final String n5(String var1) {
      if (this.t2 != null && ".".equals(this.t2.m1())) {
         return var1;
      }

      r8 var2 = null;
      r8[] var3 = new r8[]{var2};
      boolean var4 = r8.n5(var1, 0, var3);
      var2 = var3[0];
      if (var4) {
         if (var2.z3()) {
            return var1;
         }

         if (this.t2 != null) {
            if (this.t2.u9() != 2 && this.t2.u9() != 3 && this.t2.u9() != 4) {
               var2 = new r8(z1.l6(this.t2.x8(), var1), 0);
               if (var2.z3() && var2.c8()) {
                  return var2.x8();
               }

               return var2.toString();
            }

            var3[0] = var2;
            boolean var5 = r8.n5(this.t2, var3[0], var3);
            var2 = var3[0];
            if (var5) {
               return var2.toString();
            }
         }
      }

      var1 = !d1.n5(this.l6.n5()) ? z1.l6(this.l6.n5(), var1) : var1;
      return d1.n5(var1, "\\", "/");
   }

   private void u3() {
      t2 var1 = new t2(this);
      var1.r8("4px");
      this.k5.y4().c8(var1).l6().l6();
   }

   public final com.aspose.slides.internal.w5.k5 n5(com.aspose.slides.internal.f5.z3 var1) {
      r4 var2 = var1.s3();
      if (var2 != null && var2.n3() == 3 && ((d5)var2).k5()) {
         var2 = var2.s3();
      }

      return com.aspose.slides.internal.v6g.k5.n5(var2, com.aspose.slides.internal.w5.k5.class);
   }
}
