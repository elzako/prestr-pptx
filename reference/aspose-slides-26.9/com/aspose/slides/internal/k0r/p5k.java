package com.aspose.slides.internal.k0r;

import com.aspose.slides.PptCorruptFileException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.NotImplementedException;

public class p5k {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9("___PPT9", "___PPT10", "___PPT11", "___PPT12");

   public static e6r n5(com.aspose.slides.internal.z0k.n5 var0) {
      return n5(var0, null);
   }

   public static e6r n5(com.aspose.slides.internal.z0k.n5 var0, e6r var1) {
      return n5(var0, null, var1);
   }

   public static e6r n5(com.aspose.slides.internal.z0k.n5 var0, r5w var1, e6r var2) {
      String var3 = "NotDefined";

      try {
         z6z var4 = new z6z(var0);
         e6r var5 = n5(var4, var1, var2, var0);
         var3 = var5.toString();
         var5.n5(var0, var4);
         return var5;
      } catch (RuntimeException var6) {
         throw new PptCorruptFileException(com.aspose.slides.ms.System.d1.n5(new String[]{"Couldn't read [", var3, "]"}), var6);
      }
   }

   static e6r n5(z6z var0, r5w var1, e6r var2, com.aspose.slides.internal.z0k.n5 var3) {
      e6r var5;
      int var4 = var0.u3();
      label316:
      switch (var4) {
         case 1000:
            var5 = new t1();
            break;
         case 1001:
            var5 = new u6();
            break;
         case 1002:
            var5 = new z6();
            break;
         case 1006:
            var5 = new u6p();
            break;
         case 1007:
            var5 = new h3d();
            break;
         case 1008:
            var5 = new o4();
            break;
         case 1009:
            var5 = new m0();
            break;
         case 1010:
            var5 = new a5();
            break;
         case 1011:
            var5 = new w1n(var1);
            break;
         case 1016:
            var5 = new k2();
            break;
         case 1017:
            var5 = new l2p();
            break;
         case 1018:
            var5 = new h3r();
            break;
         case 1019:
            var5 = new n2();
            break;
         case 1021:
            var5 = new r1x();
            break;
         case 1022:
            var5 = new r6i();
            break;
         case 1023:
            var5 = new e2o();
            break;
         case 1024:
            var5 = new m2n();
            break;
         case 1025:
            var5 = new r7c();
            break;
         case 1026:
            var5 = new t5g();
            break;
         case 1030:
            var5 = new z7();
            break;
         case 1031:
            var5 = new l9();
            break;
         case 1032:
            var5 = new b8c();
            break;
         case 1033:
            var5 = new c5();
            break;
         case 1034:
            var5 = new d9();
            break;
         case 1035:
            var5 = new v0();
            break;
         case 1036:
            var5 = new h2();
            break;
         case 1037:
            var5 = new s2();
            break;
         case 1038:
            var5 = new v2s();
            break;
         case 1039:
            var5 = new f6z();
            break;
         case 1040:
            var5 = new r0();
            break;
         case 1041:
            var5 = new p5();
            break;
         case 1042:
            var5 = new b0();
            break;
         case 1043:
            var5 = new k1();
            break;
         case 1044:
            var5 = new o1();
            break;
         case 1045:
            var5 = new d7();
            break;
         case 1052:
            var5 = new x7n();
            break;
         case 1053:
            var5 = new u1s();
            break;
         case 1054:
            var5 = new e5a();
            break;
         case 1055:
            var5 = new g8v();
            break;
         case 1056:
            var5 = new o9b();
            break;
         case 1058:
            var5 = new t4r();
            break;
         case 1059:
            var5 = new v7u();
            break;
         case 1060:
            var5 = new x4g();
            break;
         case 1061:
            var5 = new d4n();
            break;
         case 1062:
            var5 = new z0k();
            break;
         case 1063:
            var5 = new n3c();
            break;
         case 1064:
            var5 = new r3q();
            break;
         case 2000:
            var5 = new e5();
            break;
         case 2005:
            var5 = new e0();
            break;
         case 2006:
            var5 = new o2();
            break;
         case 2020:
            var5 = new d0p(0);
            break;
         case 2021:
            var5 = new t1z();
            break;
         case 2022:
            var5 = new x6s(0);
            break;
         case 2023:
            var5 = new s5g();
            break;
         case 2032:
            var5 = new k7();
            break;
         case 2040:
            var5 = new c8();
            break;
         case 2041:
            var5 = new t2();
            break;
         case 3009:
            var5 = new t5();
            break;
         case 3011:
            var5 = new m7();
            break;
         case 3035:
            var5 = new p6t();
            break;
         case 3036:
            var5 = new p4l();
            break;
         case 3037:
            var5 = new j9e();
            break;
         case 3998:
            var5 = new g9(var1);
            break;
         case 3999:
            var5 = new y8m(var1);
            break;
         case 4000:
            var5 = new x1f(var1);
            break;
         case 4001:
            var5 = new w4w(var1);
            break;
         case 4002:
            var5 = new n8(var1);
            break;
         case 4003:
            var5 = new o6t();
            break;
         case 4004:
            var5 = new n2z();
            break;
         case 4005:
            var5 = new g2x();
            break;
         case 4006:
            var5 = new q8g(var1);
            break;
         case 4007:
            var5 = new z1n(var1);
            break;
         case 4008:
            var5 = new k2p(var1);
            break;
         case 4009:
            var5 = new r7n();
            break;
         case 4010:
            var5 = new c9t(var1);
            break;
         case 4011:
            var5 = new d5();
            break;
         case 4012:
            var5 = new t9p();
            break;
         case 4013:
            var5 = new j8m();
            break;
         case 4014:
            var5 = new p0();
            break;
         case 4015:
            var5 = new s1();
            break;
         case 4016:
            var5 = new z6e();
            break;
         case 4017:
            var5 = new x7i();
            break;
         case 4018:
            var5 = new c1x();
            break;
         case 4019:
            var5 = new u1();
            break;
         case 4020:
            var5 = new o3i();
            break;
         case 4021:
            var5 = new x2();
            break;
         case 4022:
            var5 = new r5d();
            break;
         case 4023:
            var5 = new z0();
            break;
         case 4024:
            var5 = new i2();
            break;
         case 4026:
            var5 = new z1();
            break;
         case 4033:
            var5 = new n6();
            break;
         case 4035:
            var5 = new r6();
            break;
         case 4040:
            if (com.aspose.slides.internal.v6g.k5.l6(var2, a5.class)) {
               var5 = new c7();
            } else {
               if (!com.aspose.slides.internal.v6g.k5.l6(var2, g3.class)) {
                  throw new Exception();
               }

               var5 = new v9();
            }
            break;
         case 4041:
            var5 = new g8();
            break;
         case 4044:
            var5 = new w9(0);
            break;
         case 4045:
            var5 = new j6();
            break;
         case 4046:
            var5 = new b9(0);
            break;
         case 4049:
            var5 = new m8();
            break;
         case 4050:
            var5 = new r9();
            break;
         case 4051:
            var5 = new p4();
            break;
         case 4055:
            var5 = new d6();
            break;
         case 4056:
            var5 = new u0a(var1);
            break;
         case 4057:
            var5 = new i8();
            break;
         case 4058:
            var5 = new x5();
            break;
         case 4063:
            var5 = new c7f(var1);
            break;
         case 4068:
            var5 = new q2();
            break;
         case 4071:
            var5 = new k0t();
            break;
         case 4074:
            var5 = new r5(0);
            break;
         case 4078:
            var5 = new q3(0);
            break;
         case 4080:
            var5 = new j2p();
            break;
         case 4081:
            var5 = new n5();
            break;
         case 4082:
            var5 = new o7(var1);
            break;
         case 4083:
            var5 = new k6();
            break;
         case 4085:
            var5 = new c4i();
            break;
         case 4086:
            var5 = new y2();
            break;
         case 4087:
            var5 = new a0(var1);
            break;
         case 4088:
            var5 = new f8(var1);
            break;
         case 4089:
            var5 = new b4(var1);
            break;
         case 4090:
            var5 = new z9(var1);
            break;
         case 4091:
            var5 = new i4();
            break;
         case 4100:
            var5 = new u2();
            break;
         case 4101:
            var5 = new r7(0);
            break;
         case 4102:
            var5 = new y9(0);
            break;
         case 4103:
            var5 = new n7(0);
            break;
         case 4109:
            var5 = new l5();
            break;
         case 4110:
            var5 = new w3();
            break;
         case 4111:
            var5 = new a2(0);
            break;
         case 4112:
            var5 = new h1(0);
            break;
         case 4113:
            var5 = new h9();
            break;
         case 4114:
            var5 = new a1();
            break;
         case 4115:
            var5 = new n9();
            break;
         case 4116:
            var5 = new l6();
            break;
         case 4117:
            var5 = new f6(var1);
            break;
         case 4120:
            var5 = new y6();
            break;
         case 5000:
            switch (var2.r4()) {
               case 1000:
                  var5 = new o0();
                  break label316;
               case 1006:
               case 1008:
               case 1016:
               case 4041:
                  var5 = new l7h();
                  break label316;
               case 2000:
                  var5 = new o0();
                  break label316;
               case 61457:
                  var5 = new k9m();
                  break label316;
               default:
                  throw new Exception();
            }
         case 5001:
            var5 = new h3();
            break;
         case 5002:
            if (com.aspose.slides.internal.v6g.k5.l6(var2, k9m.class)) {
               var5 = new e3m();
            } else if (com.aspose.slides.internal.v6g.k5.l6(var2, l7h.class)) {
               var5 = new m6n();
            } else if (com.aspose.slides.internal.v6g.k5.l6(var2, o0.class)) {
               var5 = new b3();
            } else {
               var5 = new u0b();
            }
            break;
         case 5003:
            if (com.aspose.slides.internal.v6g.k5.l6(var2, e3m.class)) {
               switch (n5.n5(((z1)com.aspose.slides.internal.v6g.k5.n5(var2, e3m.class).e2().get_Item(0)).l6())) {
                  case 0:
                     var5 = new e1();
                     break label316;
                  case 1:
                     var5 = new v1();
                     break label316;
                  case 2:
                     var5 = new m6();
                     break label316;
                  default:
                     var5 = new u9();
               }
            } else if (com.aspose.slides.internal.v6g.k5.l6(var2, m6n.class)) {
               switch (n5.n5(((z1)com.aspose.slides.internal.v6g.k5.n5(var2, m6n.class).e2().get_Item(0)).l6())) {
                  case 0:
                     var5 = new m2();
                     break label316;
                  case 1:
                     var5 = new g4();
                     break label316;
                  case 2:
                  default:
                     var5 = new u9();
                     break label316;
                  case 3:
                     var5 = new f3();
               }
            } else {
               if (!com.aspose.slides.internal.v6g.k5.l6(var2, b3.class)) {
                  throw new Exception();
               }

               switch (n5.n5(((z1)com.aspose.slides.internal.v6g.k5.n5(var2, b3.class).e2().get_Item(0)).l6())) {
                  case 0:
                     var5 = new g3();
                     break label316;
                  case 1:
                     var5 = new p2();
                     break label316;
                  case 2:
                     var5 = new h7();
                     break label316;
                  case 3:
                     var5 = new t8();
                     break label316;
                  default:
                     var5 = new u9();
               }
            }
            break;
         case 6000:
            var5 = new x4();
            break;
         case 6002:
            var5 = new j2();
            break;
         case 6010:
            var5 = new u7();
            break;
         case 6011:
            var5 = new l0();
            break;
         case 6013:
            var5 = new p9();
            break;
         case 6014:
            var5 = new s7();
            break;
         case 6020:
            var5 = new o5();
            break;
         case 6021:
            var5 = new e9();
            break;
         case 11003:
            int var6 = (int)var3.c4();
            int var7 = (int)var3.c4();
            label300:
            switch (var7) {
               case 1:
                  switch (var6) {
                     case 5:
                        var5 = new t1h();
                        break label300;
                     default:
                        var5 = new i8n();
                        break label300;
                  }
               case 2:
                  var5 = new v7o();
                  break;
               default:
                  var5 = new k0y();
            }

            var3.x8().seek(-8L, 1);
            break;
         case 11008:
            var5 = new i0();
            break;
         case 11009:
            var5 = new q5v();
            break;
         case 11010:
            var5 = new n3();
            break;
         case 11011:
            var5 = new x8();
            break;
         case 11012:
            var5 = new q0();
            break;
         case 11013:
            var5 = new t4();
            break;
         case 11014:
            var5 = new p8();
            break;
         case 11015:
            var5 = new s3();
            break;
         case 11016:
            var5 = new i5();
            break;
         case 11017:
            var5 = new g0();
            break;
         case 11018:
            var5 = new w4();
            break;
         case 11019:
            var5 = new y9w();
            break;
         case 11021:
            var5 = new i0e();
            break;
         case 12000:
            var5 = new z8();
            break;
         case 12001:
            var5 = new m3();
            break;
         case 12004:
            var5 = new w1();
            break;
         case 12005:
            var5 = new j5();
            break;
         case 12006:
            var5 = new n0();
            break;
         case 12007:
            var5 = new f1();
            break;
         case 12010:
            var5 = new o8m();
            break;
         case 12012:
            var5 = new i1();
            break;
         case 12017:
            var5 = new f3c();
            break;
         case 12052:
            var5 = new c4();
            break;
         case 13000:
            var5 = new x7();
            break;
         case 14000:
            var5 = new v6();
            break;
         case 14001:
            var5 = new v4();
            break;
         case 14002:
            var5 = new g5();
            break;
         case 14003:
            var5 = new n5u();
            break;
         case 14100:
            var5 = new k1d();
            break;
         case 61440:
            var5 = new y7();
            break;
         case 61441:
            var5 = new o6();
            break;
         case 61442:
            var5 = new l1();
            break;
         case 61443:
            var5 = new e4();
            break;
         case 61444:
            var5 = new q5();
            break;
         case 61445:
            var5 = new r2();
            break;
         case 61446:
            var5 = new q7();
            break;
         case 61447:
            var5 = new c6();
            break;
         case 61448:
            var5 = new b7();
            break;
         case 61449:
            var5 = new q9();
            break;
         case 61450:
            var5 = new p1();
            break;
         case 61451:
            var5 = new r3();
            break;
         case 61453:
            var5 = new d3();
            break;
         case 61455:
            var5 = new v7();
            break;
         case 61456:
            var5 = new t7();
            break;
         case 61457:
            var5 = new c9();
            break;
         case 61458:
            var5 = new s6();
            break;
         case 61460:
            var5 = new i7();
            break;
         case 61463:
            var5 = new x1();
            break;
         case 61466:
            var5 = new i3();
            break;
         case 61467:
            var5 = new b6();
            break;
         case 61468:
            var5 = new g1();
            break;
         case 61469:
         case 61482:
            var5 = new q6();
            break;
         case 61470:
            var5 = new k4();
            break;
         case 61471:
            var5 = new s8();
            break;
         case 61481:
            var5 = new e8();
            break;
         case 61720:
            var5 = new w0();
            break;
         case 61722:
            var5 = new o3();
            break;
         case 61725:
            var5 = new q8();
            break;
         case 61726:
            var5 = new o9();
            break;
         case 61729:
            var5 = new m9();
            break;
         case 61730:
            var5 = new a9();
            break;
         case 61733:
            var5 = new v2x();
            break;
         case 61735:
            var5 = new a2w();
            break;
         case 61736:
            var5 = new e2l();
            break;
         case 61737:
            var5 = new x5h();
            break;
         case 61738:
            var5 = new q9u();
            break;
         case 61739:
            var5 = new p6r();
            break;
         case 61740:
            var5 = new b9y();
            break;
         case 61741:
            var5 = new u7c();
            break;
         case 61742:
            var5 = new l4o();
            break;
         case 61743:
            var5 = new s7k();
            break;
         case 61744:
            var5 = new j3b();
            break;
         case 61745:
            var5 = new k5w();
            break;
         case 61746:
            var5 = new g9t();
            break;
         case 61747:
            var5 = new q4d();
            break;
         case 61748:
            var5 = new c5q();
            break;
         case 61749:
            var5 = new y5s();
            break;
         case 61750:
            var5 = new y9r();
            break;
         case 61751:
            var5 = new s0i();
            break;
         case 61752:
            var5 = new r2n();
            break;
         case 61753:
            var5 = new d7u();
            break;
         case 61754:
            var5 = new a1k();
            break;
         case 61755:
            var5 = new d9m();
            break;
         case 61756:
            var5 = new z3();
            break;
         case 61757:
            switch (var2.r4()) {
               case 61738:
                  var5 = new b1r();
                  break label316;
               case 61764:
               case 61765:
                  var5 = new y2o();
                  break label316;
               default:
                  var5 = new w3k();
                  break label316;
            }
         case 61758:
            var5 = new k4o();
            break;
         case 61759:
            var5 = new y4k();
            break;
         case 61760:
            var5 = new x2y();
            break;
         case 61761:
            var5 = new o9i();
            break;
         case 61762:
            int var8 = var3.z1();
            switch (var8 & 0xFF) {
               case 0:
                  var5 = new j3z();
                  break;
               case 1:
                  var5 = new s5r();
                  break;
               case 2:
                  var5 = new f4l();
                  break;
               case 3:
                  var5 = new g5d();
                  break;
               default:
                  throw new NotImplementedException(com.aspose.slides.ms.System.d1.n5("Unknown TimeVariant type: {0}", new Object[]{Byte.valueOf((byte)var8)}));
            }

            var3.x8().seek(-1L, 1);
            break;
         case 61763:
            var5 = new e4w();
            break;
         case 61764:
            var5 = new t6();
            break;
         case 61765:
            var5 = new c9b();
            break;
         default:
            var5 = new u0b();
      }

      var5.l6(var2);
      return var5;
   }
}
