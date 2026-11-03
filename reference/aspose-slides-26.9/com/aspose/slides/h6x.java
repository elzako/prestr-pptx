package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.EndOfStreamException;
import com.aspose.slides.exceptions.InvalidDataException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.ms.System.IDisposable;

class h6x extends o0s {
   private static final SortedList<com.aspose.slides.ms.System.o0, String> n5 = new SortedList<>();

   static void l6(v5s var0) {
      d5q var1 = (d5q)var0.a6();
      if (var1.l6() == null) {
         throw new InvalidDataException("No linked ExOleContainer for OleObject shape!");
      }

      if (var1.k5() == null) {
         throw new InvalidDataException("No ExStg data for OleObject shape!");
      }

      OleObjectFrame var2 = com.aspose.slides.internal.v6g.k5.n5(var1.m1(), OleObjectFrame.class);
      if (var2 == null) {
         throw new NullReferenceException("OleObjectFrame isn't created!");
      }

      n5(var0);
      com.aspose.slides.internal.k0r.x3 var3 = (com.aspose.slides.internal.k0r.x3)var1.l6();
      var2.l6 = new PictureFillFormat(var2);
      n5(var2.l6, var1);
      n5(var2, var1);
      var2.setObjectProgId(var3.u9() != null ? var3.u9().l6() : "");
      var2.setObjectName(var3.a6() != null ? var3.a6().l6() : "");
      var2.setObjectIcon(var3.u3().l6() != 1);
      var2.y4().n5(var3.u3().l6());
      var2.y4().n5(var3.h0() != null ? var3.h0().l6() : "");
      m3e.n5((FillFormat)var2.getFillFormat(), var1);
      r9a.n5(var2.getLineFormat(), (byte)2, false, var1);
      f7k.n5(var2.getEffectFormat(), var1);
      switch (var1.l6().r4() & 65535) {
         case 4044:
            l6(var1);
            break;
         case 4046:
            n5(var1);
            break;
         default:
            throw new ArgumentOutOfRangeException("Unknown ExContainer for OleObjectFrame!");
      }

      PPImage var4 = (PPImage)var2.getSubstitutePictureFormat().getPicture().getImage();
      if (var2.isObjectIcon() && var4 != null && var4.s7()) {
         String var5 = "";
         if ("image/x-wmf".equals(var4.getContentType())) {
            String[] var6 = new String[]{var5};
            com.aspose.slides.internal.n8e.k7.n5(var4.getBinaryData(), var6);
            var5 = var6[0];
         } else if ("image/x-emf".equals(var4.getContentType())) {
            String[] var7 = new String[]{var5};
            com.aspose.slides.internal.n8e.k7.l6(var4.getBinaryData(), var7);
            var5 = var7[0];
         }

         var2.a6 = var5;
         var2.u3 = var4.u9();
      }
   }

   static void k5(v5s var0) {
      t6t var1 = (t6t)var0.a6();
      if (var1.l6() == null) {
         throw new InvalidDataException("No linked ExOleContainer for OleControl shape!");
      }

      if (var1.k5() == null) {
         throw new InvalidDataException("No ExStg data for OleControl shape!");
      }

      Control var2 = var1.n5();
      com.aspose.slides.internal.k0r.q3 var3 = (com.aspose.slides.internal.k0r.q3)var1.l6();
      t6q var4 = var2.l6();
      com.aspose.slides.internal.k0r.g6 var5 = var0.k5();
      e4c var6 = new e4c();
      e4c var7 = new e4c();
      x4t var8 = new x4t();
      e4c[] var9 = new e4c[]{var6};
      e4c[] var10 = new e4c[]{var7};
      x4t[] var11 = new x4t[]{var8};
      w9v.n5(var5, var9, var10, var11);
      var9[0].l6(var6);
      var10[0].l6(var7);
      var11[0].n5(var8);
      var2.setFrame(new ShapeFrame(var6.n5, var6.l6, var7.n5, var7.l6, (byte)(var8.u3 ? 1 : 0), (byte)(var8.k5 ? 1 : 0), var8.l6));
      if (var0.u3().a6().n5().a6().getDeleteEmbeddedBinaryObjects()) {
         var2.n5(new byte[0]);
      } else {
         com.aspose.slides.internal.k0r.h9 var12 = var1.k5();
         var2.n5(var12.k5());
      }

      var2.n5(k5(var3.u9().l6()).k5());
      n5((PictureFillFormat)var2.getSubstitutePictureFormat(), var1);
      var2.setName(var3.a6() != null ? var3.a6().l6() : com.aspose.slides.ms.System.d1.n5);
      n5(var4, var5);
      var4.n5(var3.u3());
      var4.n5(var3.u9().l6());
      var4.l6(var3.h0().l6());
      var4.n5(var3.c8());
   }

   private static void n5(d5q var0) {
      com.aspose.slides.internal.k0r.b9 var1 = (com.aspose.slides.internal.k0r.b9)var0.l6();
      com.aspose.slides.internal.k0r.h9 var2 = var0.k5();
      OleObjectFrame var3 = com.aspose.slides.internal.v6g.k5.n5(var0.m1(), OleObjectFrame.class);
      var3.l6(true);
      com.aspose.slides.internal.k0r.u0 var4 = null;

      try {
         var4 = new com.aspose.slides.internal.k0r.u0(var2.k5());
      } catch (EndOfStreamException var14) {
         String var6 = "OleObject is corrupted: ";
         ISlide var7 = com.aspose.slides.internal.v6g.k5.n5(var0.y4().y4(), ISlide.class);
         if (var7 != null) {
            var6 = com.aspose.slides.ms.System.d1.n5(new String[]{"OleObject on slide #", com.aspose.slides.ms.System.a3.l6(var7.getSlideNumber()), " is corrupted: "});
         }

         var0.y4().a6().n5(com.aspose.slides.ms.System.d1.n5(new String[]{var6, var14.getMessage()}), 1);
      }

      if (var4 != null && var4.n5() != null) {
         com.aspose.slides.internal.k0r.k0 var5 = var4.n5().t2();
         com.aspose.slides.internal.k0r.l2 var16 = com.aspose.slides.internal.v6g.k5.n5(var5.l6(), com.aspose.slides.internal.k0r.l2.class);
         if (var16 == null) {
            com.aspose.slides.internal.k0r.s5 var18 = com.aspose.slides.internal.v6g.k5.n5(var5.l6(), com.aspose.slides.internal.k0r.s5.class);
            if (var18 != null) {
               var3.n5 = var18.u3();
            }
         } else {
            String var17 = var16.s7();
            if (var17 == null || !u3(var17)) {
               var17 = var16.u9();
            }

            var3.y4().k5(var17);
            var3.n5 = var17;
         }

         if (var5.l6() != null) {
            var3.k5(var5.l6().u3());
         }

         try {
            com.aspose.slides.internal.k0r.k0 var19 = var4.n5().h0();
            if (var19 != null) {
               String var8 = com.aspose.slides.ms.System.d1.n5;
               com.aspose.slides.internal.k0r.l2 var9 = com.aspose.slides.internal.v6g.k5.n5(var19.l6(), com.aspose.slides.internal.k0r.l2.class);
               if (var9 != null) {
                  var8 = var9.s7();
                  if (com.aspose.slides.ms.System.d1.n5(var8) || !u3(var8)) {
                     var8 = var9.u9();
                  }
               } else {
                  com.aspose.slides.internal.k0r.s5 var10 = com.aspose.slides.internal.v6g.k5.n5(var19.l6(), com.aspose.slides.internal.k0r.s5.class);
                  if (var10 != null) {
                     var8 = var10.u3();
                  }
               }

               if (!com.aspose.slides.ms.System.d1.n5(var8) && !com.aspose.slides.internal.z0k.z1.h0(var8) && !com.aspose.slides.ms.System.d1.a6("???", var8)) {
                  if (com.aspose.slides.ms.System.d1.l6(var8, com.aspose.slides.ms.System.d1.n5(new Object[]{"..", com.aspose.slides.internal.z0k.z1.k5}))
                     && var8.length() > 3) {
                     var8 = com.aspose.slides.ms.System.d1.k5(var8, 3);
                  }

                  if (com.aspose.slides.internal.n2d.m1.l6 || com.aspose.slides.internal.n2d.m1.k5) {
                     var8 = com.aspose.slides.ms.System.d1.n5(var8, '\\', com.aspose.slides.internal.z0k.z1.k5);
                  }

                  var3.y4().l6(var8);
                  if (!com.aspose.slides.ms.System.d1.n5(var0.y4().a6().n5().l6)) {
                     String var21 = com.aspose.slides.internal.z0k.z1.u9(var0.y4().a6().n5().l6);
                     var8 = com.aspose.slides.ms.System.d1.u3(var8,new char[]{ com.aspose.slides.internal.z0k.z1.k5});
                     com.aspose.slides.ms.System.r8 var11 = new com.aspose.slides.ms.System.r8(com.aspose.slides.internal.z0k.z1.l6(var21, var8));
                     var3.n5 = var11.x8();
                  }
               }
            }
         } catch (ArgumentException var12) {
            com.aspose.slides.internal.n8e.v4.n5(var12);
            var3.n5 = "???";
         } catch (RuntimeException var13) {
            com.aspose.slides.internal.n8e.v4.n5(var13);
            if (!com.aspose.slides.ms.System.d1.n5(var3.y4().c8())) {
               var3.n5 = var3.y4().c8();
            }
         }

         var3.y4().n5(var4.n5().x8().k5());
      }

      var3.u9 = var1.l6().l6() == 1;
      j1r var15 = var3.y4();
      var15.n5(var1.c8());
   }

   private static void l6(d5q var0) {
      com.aspose.slides.internal.k0r.w9 var1 = (com.aspose.slides.internal.k0r.w9)var0.l6();
      com.aspose.slides.internal.k0r.h9 var2 = var0.k5();
      OleObjectFrame var3 = com.aspose.slides.internal.v6g.k5.n5(var0.m1(), OleObjectFrame.class);
      if (var3.getPlaceholder() == null || var3.getPlaceholder().getType() != 4 && var3.getPlaceholder().getType() != 5) {
         try {
            var3.n5(var2.k5());
         } catch (com.aspose.slides.internal.e5a.f2 var11) {
            String var5 = "Embedded OLE-object is corrupted";
            ISlide var6 = com.aspose.slides.internal.v6g.k5.n5(var0.y4().y4(), ISlide.class);
            if (var6 != null) {
               var5 = com.aspose.slides.ms.System.d1.n5(new String[]{
                  "Embedded OLE-object on slide #", com.aspose.slides.ms.System.a3.l6(var6.getSlideNumber()), " is corrupted: "
               });
            }

            var0.y4().a6().n5(var5, 1);
            var3.x8().n5(true);
         }

         if (var3.e2() != null && var3.e2().length > 0) {
            com.aspose.slides.internal.z0k.e2 var4 = new com.aspose.slides.internal.z0k.e2(var3.e2());

            try {
               i1x var13 = var0.y4().u9();
               if (!r6z.n5(var4, var3, var13.n5())) {
                  String var14 = com.aspose.slides.ms.System.d1.a6(var3.getObjectProgId());
                  if (e6f.n5().containsKey(var14)) {
                     var3.n5(e6f.n5().get_Item(var14).a6());
                     var3.z1().n5(e6f.n5().get_Item(var14).n5());
                  }
               } else if (var13.n5().t9().a6().getDeleteEmbeddedBinaryObjects()) {
                  var3.n5(new byte[0]);
               }
            } finally {
               if (var4 != null) {
                  var4.dispose();
               }
            }
         }

         j1r var12 = var3.y4();
         var12.n5(var1.l6().l6());
         var12.l6(var1.l6().k5());
         var12.k5(var1.l6().u3());
         var12.n5(var1.c8());
         if (var3.e2() != null) {
            if (var3.z1().getEmbeddedFileData() == null) {
               var3.z1().n5(var3.e2());
            }

            if (com.aspose.slides.ms.System.d1.n5(var3.z1().getEmbeddedFileExtension())) {
               var3.z1().n5("bin");
            }
         } else {
            var3.n5(new OleEmbeddedDataInfo());
         }
      } else {
         var0.x8();
         var0.y4().m3().removeItemByKey(var0.t4().t2());
      }
   }

   static long n5(Control var0, k1z var1) {
      y2q var2 = var1.u3().a6();
      g6o var3 = var2.n5();
      com.aspose.slides.internal.k0r.q3 var4 = new com.aspose.slides.internal.k0r.q3();
      com.aspose.slides.internal.k0r.c5 var5 = var3.l6().a6().h0().h0();
      var5.e2().addItem(var4);
      com.aspose.slides.internal.k0r.h9 var6 = new com.aspose.slides.internal.k0r.h9();
      if (var0.getActiveXControlBinary() != null) {
         var6.n5(var0.getActiveXControlBinary());
      } else {
         var6.n5(new byte[0]);
      }

      var6.n5(var3.l6().a6().n5(var6));
      com.aspose.slides.internal.k0r.r6 var7 = var4.u3();
      var7.n5(1);
      var7.l6(2);
      long var8 = var5.l6().l6();
      var5.l6().n5(var8 + 1L);
      var7.n5(var8);
      if (var0.l6().n5() == null) {
         var0.l6().n5(n5(var0.k5().k5()));
         if (var0.l6().l6() == null) {
            if (com.aspose.slides.ms.System.d1.n5(var0.l6().n5())) {
               var0.l6().l6("");
            } else {
               String[] var10 = com.aspose.slides.ms.System.d1.u9(var0.l6().n5(), '.');
               if (var10.length > 1) {
                  var0.l6().l6(com.aspose.slides.ms.System.d1.n5(new String[]{"Microsoft Forms 2.0 ", var10[1]}));
               } else {
                  var0.l6().l6(com.aspose.slides.ms.System.d1.n5(new String[]{"Microsoft Forms 2.0 ", var10[0]}));
               }
            }
         }
      }

      var7.k5(l6(var0.l6().n5()));
      var7.l6(var6.c8());
      var4.a6().n5(var0.getName());
      var4.u9().n5(var0.l6().n5());
      var4.h0().n5(var0.l6().l6());
      com.aspose.slides.internal.k0r.i4 var11 = var4.l6();
      var11.n5(var2.n3().u3());
      return var7.k5();
   }

   static long n5(OleObjectFrame var0, k1z var1) {
      y2q var2 = var1.u3().a6();
      g6o var3 = var2.n5();
      com.aspose.slides.internal.k0r.c5 var4 = var3.l6().a6().h0().h0();
      com.aspose.slides.internal.k0r.r4 var5;
      if (var0.isObjectLink()) {
         var5 = new com.aspose.slides.internal.k0r.b9();
      } else {
         var5 = new com.aspose.slides.internal.k0r.w9();
      }

      var4.e2().addItem(var5);
      com.aspose.slides.internal.k0r.h9 var16;
      if (var0.isObjectLink()) {
         com.aspose.slides.internal.k0r.u0 var6 = new com.aspose.slides.internal.k0r.u0();
         var6.n5().n5(1);
         var6.n5().n5(var0.y4().t2().k5());
         String var7 = "!";
         int var8 = com.aspose.slides.ms.System.d1.c8(var0.getLinkPathLong(), var7);
         boolean var9 = !com.aspose.slides.ms.System.d1.n5(var0.y4().c8());
         com.aspose.slides.internal.k0r.l2 var10 = null;
         com.aspose.slides.internal.k0r.d4 var11 = null;
         if (var8 > 0 && !var9) {
            com.aspose.slides.internal.k0r.l2[] var12 = new com.aspose.slides.internal.k0r.l2[]{var10};
            com.aspose.slides.internal.k0r.d4[] var13 = new com.aspose.slides.internal.k0r.d4[]{var11};
            var6.n5().l6(new com.aspose.slides.internal.k0r.k0(n5(var12, var13)));
            var10 = var12[0];
            var11 = var13[0];
         } else {
            var6.n5().l6(new com.aspose.slides.internal.k0r.k0(new com.aspose.slides.internal.k0r.l2()));
            var10 = (com.aspose.slides.internal.k0r.l2)var6.n5().t2().l6();
         }

         if (var9) {
            var10.l6(var0.y4().c8());
         } else if (com.aspose.slides.ms.System.d1.a6("???", var0.getLinkPathLong())) {
            var10.n5(var0.getLinkPathLong());
         } else if (var8 > 0) {
            String var31 = com.aspose.slides.ms.System.d1.l6(var0.getLinkPathLong(), 0, var8);
            var10.l6(var31);
            String var34 = com.aspose.slides.ms.System.d1.l6(var0.getLinkPathLong(), var8 + 1, var0.getLinkPathLong().length() - var31.length() - 1);
            var11.n5(var7);
            var11.l6(var34);
         } else {
            var10.l6(var0.getLinkPathLong());
         }

         if (!com.aspose.slides.ms.System.d1.n5(var0.y4().h0())) {
            var8 = com.aspose.slides.ms.System.d1.c8(var0.y4().h0(), var7);
            if (var8 > 0) {
               com.aspose.slides.internal.k0r.l2[] var32 = new com.aspose.slides.internal.k0r.l2[]{var10};
               com.aspose.slides.internal.k0r.d4[] var35 = new com.aspose.slides.internal.k0r.d4[]{var11};
               var6.n5().n5(new com.aspose.slides.internal.k0r.k0(n5(var32, var35)));
               var10 = var32[0];
               var11 = var35[0];
               String var14 = com.aspose.slides.ms.System.d1.l6(var0.y4().h0(), 0, var8);
               var10.n5(com.aspose.slides.internal.z0k.z1.l6("..", var14));
               String var15 = com.aspose.slides.ms.System.d1.l6(var0.y4().h0(), var8 + 1, var0.y4().h0().length() - var14.length() - 1);
               var11.n5(var7);
               var11.l6(var15);
            } else {
               var6.n5().n5(new com.aspose.slides.internal.k0r.k0(new com.aspose.slides.internal.k0r.l2()));
               var10 = (com.aspose.slides.internal.k0r.l2)var6.n5().h0().l6();
               var10.n5(com.aspose.slides.internal.z0k.z1.l6("..", var0.y4().h0()));
            }
         }

         com.aspose.slides.internal.z0k.e2 var33 = new com.aspose.slides.internal.z0k.e2();

         try {
            var6.l6(var33);
            var16 = new com.aspose.slides.internal.k0r.h9();
            var16.n5(var33.toArray());
         } finally {
            if (var33 != null) {
               var33.dispose();
            }
         }
      } else {
         var16 = new com.aspose.slides.internal.k0r.h9();
         if (var0.x8().l6()) {
            var16.n5(new byte[0]);
         } else {
            var16.n5(n5(var0));
         }
      }

      var16.n5(var3.l6().a6().n5(var16));
      com.aspose.slides.internal.k0r.r6 var22 = ((com.aspose.slides.internal.k0r.x3)var5).u3();
      var22.n5(var0.y4().a6() > 0 ? var0.y4().a6() : (var0.isObjectIcon() ? 4 : 1));
      var22.l6(var0.isObjectLink() ? 1 : 0);
      long var18 = var4.l6().l6();
      var4.l6().n5(var18 + 1L);
      var22.n5(var18);
      var22.k5(l6(var0.getObjectProgId()));
      j1r var24 = var0.y4();
      var22.l6(var16.c8());
      if (var0.isObjectLink()) {
         com.aspose.slides.internal.k0r.m8 var28 = ((com.aspose.slides.internal.k0r.b9)var5).l6();
         var28.n5(var2.n3().u3());
         var28.n5(var0.getUpdateAutomatic() ? 1 : 3);
      } else {
         com.aspose.slides.internal.k0r.j6 var29 = ((com.aspose.slides.internal.k0r.w9)var5).l6();
         var29.n5(var24.n5());
         var29.n5(var24.l6());
         var29.k5(var24.u3());
         var29.l6(var24.k5());
      }

      ((com.aspose.slides.internal.k0r.x3)var5).a6().n5(var0.getObjectName());
      ((com.aspose.slides.internal.k0r.x3)var5).u9().n5(var0.getObjectProgId());
      ((com.aspose.slides.internal.k0r.x3)var5).h0().n5(var24.u9());
      return var22.k5();
   }

   private static void n5(PictureFillFormat var0, a9x var1) {
      if (var0 == null) {
         throw new ArgumentNullException("pictureFillFormat");
      }

      com.aspose.slides.internal.k0r.q5 var2 = n5(var1);
      var0.setPictureFillMode(1);
      s4q.n5(var0, 4294967295L, var1);
   }

   private static void n5(OleObjectFrame var0, a9x var1) {
      if (var0 == null) {
         throw new ArgumentNullException("pictureFillFormat");
      }

      com.aspose.slides.internal.k0r.q5 var2 = n5(var1);
      com.aspose.slides.internal.k0r.z5 var3 = com.aspose.slides.internal.v6g.k5.n5(var2.a6().l6().n5(267), com.aspose.slides.internal.k0r.z5.class);
      if (var3 != null) {
         var0.y4().n5(new com.aspose.slides.ms.System.o5<>(var3.j5()));
      }
   }

   private static com.aspose.slides.internal.k0r.q5 n5(a9x var0) {
      com.aspose.slides.internal.k0r.q5 var1 = var0.n3();
      if (var1 != null && var1.s7() != null && var1.s7().a6() != null) {
         return var1;
      } else {
         throw new PptException("Frame is not an OleObjectFrame_PPT.");
      }
   }

   private static com.aspose.slides.internal.k0r.s5 n5(com.aspose.slides.internal.k0r.l2[] var0, com.aspose.slides.internal.k0r.d4[] var1) {
      com.aspose.slides.internal.k0r.s5 var2 = new com.aspose.slides.internal.k0r.s5();
      var2.n5(2L);
      var0[0] = new com.aspose.slides.internal.k0r.l2();
      var1[0] = new com.aspose.slides.internal.k0r.d4();
      var2.n5(new com.aspose.slides.internal.k0r.k0[]{new com.aspose.slides.internal.k0r.k0(var0[0]), new com.aspose.slides.internal.k0r.k0(var1[0])});
      return var2;
   }

   private static byte[] n5(OleObjectFrame var0) {
      byte[] var1 = var0.z1().getEmbeddedFileData();
      if (var1 != null && var1.length > 0 && var1.length == var0.e2().length) {
         e5i var2 = null;
         String var3 = com.aspose.slides.ms.System.d1.u9(var0.getObjectProgId());
         e5i[] var4 = new e5i[]{var2};
         boolean var5 = e6f.n5().tryGetValue(var3, var4) && var4[0].u3();
         var2 = var4[0];
         if (var5) {
            int var6 = e6f.l6().indexOfValue(var3);
            if (var6 != -1) {
               return e6f.l6(var1, var3, e6f.l6().getKeys().get_Item(var6).k5());
            }
         }
      }

      return var0.e2();
   }

   private static int l6(String var0) {
      byte var1 = 0;
      if (var0 != null && !com.aspose.slides.ms.System.d1.a6(var0, com.aspose.slides.ms.System.d1.n5)) {
         String var2 = com.aspose.slides.ms.System.d1.u9(var0);
         if (com.aspose.slides.ms.System.d1.c8(var2, "word.document") == 0) {
            var1 = 2;
         } else if (com.aspose.slides.ms.System.d1.c8(var2, "excel.sheet") == 0) {
            var1 = 3;
         } else if (com.aspose.slides.ms.System.d1.c8(var2, "msgraph") == 0) {
            var1 = 4;
         } else if (com.aspose.slides.ms.System.d1.c8(var2, "ogrchart") == 0) {
            var1 = 5;
         } else if (com.aspose.slides.ms.System.d1.c8(var2, "msorgchart") == 0) {
            var1 = 5;
         } else if (com.aspose.slides.ms.System.d1.c8(var2, "orgpluswopx") == 0) {
            var1 = 5;
         } else if (com.aspose.slides.ms.System.d1.c8(var2, "equation") == 0) {
            var1 = 6;
         } else if (com.aspose.slides.ms.System.d1.c8(var2, "mswordart") == 0) {
            var1 = 7;
         } else if (com.aspose.slides.ms.System.d1.c8(var2, "soundrec") == 0) {
            var1 = 8;
         } else if (com.aspose.slides.ms.System.d1.c8(var2, "msproject") == 0) {
            var1 = 12;
         } else if (com.aspose.slides.ms.System.d1.c8(var2, "note") == 0) {
            var1 = 13;
         } else if (com.aspose.slides.ms.System.d1.c8(var2, "excel.chart") == 0) {
            var1 = 14;
         } else if (com.aspose.slides.ms.System.d1.c8(var2, "mplayer") == 0) {
            var1 = 15;
         } else if (com.aspose.slides.ms.System.d1.c8(var2, "midfile") == 0) {
            var1 = 15;
         } else if (com.aspose.slides.ms.System.d1.c8(var2, "avifile") == 0) {
            var1 = 15;
         } else if (com.aspose.slides.ms.System.d1.c8(var2, "wordpad") == 0) {
            var1 = 16;
         } else if (com.aspose.slides.ms.System.d1.c8(var2, "visio") == 0) {
            var1 = 17;
         } else if (com.aspose.slides.ms.System.d1.c8(var2, "word.opendocument") == 0) {
            var1 = 18;
         } else if (com.aspose.slides.ms.System.d1.c8(var2, "excel.opendocument") == 0) {
            var1 = 19;
         }

         return var1;
      } else {
         return var1;
      }
   }

   private static String n5(com.aspose.slides.ms.System.o0 var0) {
      if (com.aspose.slides.ms.System.o0.n5(var0, com.aspose.slides.ms.System.o0.n5)) {
         return "";
      }

      String var1 = null;
      String[] var2 = new String[]{var1};
      boolean var3 = !n5.tryGetValue(var0.k5(), var2);
      var1 = var2[0];
      if (var3) {
         var1 = "";
      }

      return var1;
   }

   private static com.aspose.slides.ms.System.o0 k5(String var0) {
      com.aspose.slides.ms.System.o0 var1 = com.aspose.slides.ms.System.o0.n5.k5();
      if (com.aspose.slides.ms.System.d1.n5(var0)) {
         return var1;
      }

      IGenericEnumerator var2 = n5.iterator();

      try {
         while (var2.hasNext()) {
            KeyValuePair var3 = (KeyValuePair)var2.next();
            if (com.aspose.slides.ms.System.d1.l6(com.aspose.slides.ms.System.d1.u9(var0), com.aspose.slides.ms.System.d1.u9((String)var3.getValue()))) {
               return (com.aspose.slides.ms.System.o0)var3.getKey();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1;
   }

   private static boolean u3(String var0) {
      if (com.aspose.slides.ms.System.d1.n5(var0)) {
         return true;
      }

      for (int var1 = 0; var1 < var0.length(); var1++) {
         char var2 = var0.charAt(var1);
         if (!n5(var2)) {
            return false;
         }
      }

      return true;
   }

   private static boolean n5(char var0) {
      return var0 == '\t' || var0 == '\n' || var0 == '\r' || var0 >= ' ' && var0 <= '\ud7ff' || var0 >= '\ue000' && var0 <= '�';
   }

   static {
      n5.addItem(new com.aspose.slides.ms.System.o0("6BF52A52-394A-11D3-B153-00C04F79FAA6"), "WMPlayer.OCX");
      n5.addItem(new com.aspose.slides.ms.System.o0("D27CDB6E-AE6D-11CF-96B8-444553540000"), "ShockwaveFlash");
      n5.addItem(new com.aspose.slides.ms.System.o0("8BD21D10-EC42-11CE-9E0D-00AA006002F3"), "Forms.Textbox.1");
      n5.addItem(new com.aspose.slides.ms.System.o0("8BD21D20-EC42-11CE-9E0D-00AA006002F3"), "Forms.ListBox.1");
      n5.addItem(new com.aspose.slides.ms.System.o0("8BD21D30-EC42-11CE-9E0D-00AA006002F3"), "Forms.ComboBox.1");
      n5.addItem(new com.aspose.slides.ms.System.o0("8BD21D40-EC42-11CE-9E0D-00AA006002F3"), "Forms.CheckBox.1");
      n5.addItem(new com.aspose.slides.ms.System.o0("8BD21D50-EC42-11CE-9E0D-00AA006002F3"), "Forms.OptionButton.1");
      n5.addItem(new com.aspose.slides.ms.System.o0("8BD21D60-EC42-11CE-9E0D-00AA006002F3"), "Forms.ToggleButton.1");
      n5.addItem(new com.aspose.slides.ms.System.o0("79176FB0-B7F2-11CE-97EF-00AA006D2776"), "Forms.SpinButton.1");
      n5.addItem(new com.aspose.slides.ms.System.o0("DFD181E0-5E2F-11CE-A449-00AA004A803D"), "Forms.ScrollBar.1");
      n5.addItem(new com.aspose.slides.ms.System.o0("D7053240-CE69-11CD-A777-00DD01143C57"), "Forms.CommandButton.1");
      n5.addItem(new com.aspose.slides.ms.System.o0("978C9E23-D4B0-11CE-BF2D-00AA003F40D0"), "Forms.Label.1");
      n5.addItem(new com.aspose.slides.ms.System.o0("4C599241-6926-101B-9992-00000B65C6F9"), "Forms.Image.1");
      n5.addItem(new com.aspose.slides.ms.System.o0("EAE50EB0-4A62-11CE-BED6-00AA00611080"), "Forms.TabStrip.1");
      n5.addItem(new com.aspose.slides.ms.System.o0("6E182020-F460-11CE-9BCD-00AA00608E01"), "Forms.Frame.1");
      n5.addItem(new com.aspose.slides.ms.System.o0("C62A69F0-16DC-11CE-9E98-00AA00574A4F"), "Forms.Form.1");
      n5.addItem(new com.aspose.slides.ms.System.o0("1DC3219A-5AA7-4CF2-91B3-3A5DAD74F6F2"), "ANDPlayer.1");
   }
}
