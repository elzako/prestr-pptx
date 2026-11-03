package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary$ValueCollection$Enumerator;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.BadImageFormatException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.exceptions.OperationCanceledException;
import com.aspose.slides.exceptions.OutOfMemoryException;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.Xml.XmlDocument;

class u4e {
   private final Presentation n5;
   private d5f l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9(".pps", ".pot");

   public u4e(Presentation var1) {
      this.n5 = var1;
      if (this.n5 == null) {
         throw new ArgumentNullException();
      }
   }

   public final void n5(com.aspose.slides.internal.x1.x8 var1, InterruptionToken var2) {
      this.n5.n5 = this.n5();
      this.n5.n5(0);
      if (var1.n5().l6("EncryptedPackage") && var1.n5().l6("EncryptionInfo")) {
         ((ProtectionManager)this.n5.getProtectionManager()).n5(var1);
      } else if (var1.n5().l6("Current User")) {
         com.aspose.slides.internal.k0r.e3 var3 = new com.aspose.slides.internal.k0r.e3(var1, this.n5.a6());
         this.l6 = new d5f(var3, this.n5, var2);
         this.l6();
         if (var3.h0()) {
            return;
         }

         this.k5();
         this.q0();
         this.x8();
         this.e2();
         this.n3();
         this.y4();
         this.t9();
         this.z1();
         this.t4();
         if (var3.u9() != null) {
            List$Enumerator var4 = var3.u9().iterator();

            try {
               while (var4.hasNext()) {
                  byte[] var5 = (byte[])var4.next();
                  XmlDocument var6 = new XmlDocument();
                  com.aspose.slides.internal.z0k.e2 var7 = new com.aspose.slides.internal.z0k.e2(var5);

                  try {
                     var6.load(var7);
                  } finally {
                     if (var7 != null) {
                        var7.dispose();
                     }
                  }

                  com.aspose.slides.ms.System.Xml.m8 var8 = var6.getDocumentElement();
                  com.aspose.slides.ms.System.Xml.x5 var9 = new com.aspose.slides.ms.System.Xml.x5(var8);

                  try {
                     List var10 = o6x.n5(var9);
                     if (var10 != null) {
                        List$Enumerator var11 = var10.iterator();

                        try {
                           while (var11.hasNext()) {
                              com.aspose.slides.internal.k4y.u3k var12 = (com.aspose.slides.internal.k4y.u3k)var11.next();
                              DigitalSignature var13 = new DigitalSignature();
                              if (u1n.l6(var13, var12, null)) {
                                 u1n.n5(var13, var8);
                              }

                              this.n5.getDigitalSignatures().add(var13);
                           }
                        } finally {
                           if (com.aspose.slides.internal.v6g.k5.n5(var11, IDisposable.class)) {
                              var11.dispose();
                           }
                        }
                     }
                  } finally {
                     if (var9 != null) {
                        var9.dispose();
                     }
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
                  var4.dispose();
               }
            }
         }

         this.m1();
         this.z8();
         this.z3();
      } else {
         if (!var1.n5().l6("\u0005SummaryInformation") || !var1.n5().l6("VBA") || !var1.n5().l6("PROJECT")) {
            throw new PptUnsupportedFormatException("Unknown file format.");
         }

         this.l6 = new d5f(new com.aspose.slides.internal.k0r.e3(), this.n5, var2);
         s4r.n5(this.n5);
         this.n5.getSlides().removeAt(0);
         com.aspose.slides.internal.x1.u9 var37 = (com.aspose.slides.internal.x1.u9)var1.n5().u3("\u0005SummaryInformation");
         if (var37 != null) {
            this.l6.l6().n5(var37.n5());
         }

         com.aspose.slides.internal.x1.u9 var38 = (com.aspose.slides.internal.x1.u9)var1.n5().u3("\u0005DocumentSummaryInformation");
         if (var38 != null) {
            this.l6.l6().l6(var38.n5());
         }

         this.l6();
         this.n5.n5(new com.aspose.slides.internal.l6z.h6(var1));
         this.n5.setVbaProject(new VbaProject(this.n5.l6()));
      }
   }

   public static boolean n5(com.aspose.slides.internal.x1.x8 var0) {
      if (var0 == null) {
         throw new ArgumentNullException("fileSystem");
      }

      try {
         return var0.n5().l6("EncryptedPackage");
      } catch (RuntimeException var2) {
         throw new PptReadException(var2.getMessage(), var2);
      }
   }

   public static boolean l6(com.aspose.slides.internal.x1.x8 var0) {
      if (var0 == null) {
         throw new ArgumentNullException("fileSystem");
      }

      try {
         return var0.n5().l6("EncryptionInfo");
      } catch (RuntimeException var2) {
         throw new PptReadException(var2.getMessage(), var2);
      }
   }

   public static boolean n5(com.aspose.slides.internal.z0k.t4 var0) {
      try {
         var0.seek(0L, 0);
         com.aspose.slides.internal.x1.x8 var1 = l6(var0);
         return com.aspose.slides.internal.k0r.e3.n5(var1);
      } catch (RuntimeException var2) {
         throw new PptxReadException(var2.getMessage(), var2);
      }
   }

   public static void n5(com.aspose.slides.internal.z0k.t4 var0, boolean[] var1, boolean[] var2, boolean[] var3) {
      try {
         var0.seek(0L, 0);
         com.aspose.slides.internal.x1.x8 var4 = l6(var0);
         com.aspose.slides.internal.k0r.e3.n5(var4, var1, var2, var3);
      } catch (RuntimeException var5) {
         throw new PptReadException(var5.getMessage(), var5);
      }
   }

   public static com.aspose.slides.internal.x1.x8 l6(com.aspose.slides.internal.z0k.t4 var0) {
      try {
         return new com.aspose.slides.internal.x1.x8(var0);
      } catch (com.aspose.slides.internal.x1.u3 var3) {
         throw new PptUnsupportedFormatException(var3.getMessage(), var3);
      } catch (RuntimeException var4) {
         throw new PptReadException("Can't read MSCDFileSystem.", var4);
      }
   }

   private int n5() {
      if (com.aspose.slides.ms.System.d1.n5(this.n5.l6)) {
         return 0;
      }

      switch (k5.n5(com.aspose.slides.internal.z0k.z1.a6(this.n5.l6))) {
         case 0:
            return 8;
         case 1:
            return 9;
         default:
            return 0;
      }
   }

   private byte[] n5(com.aspose.slides.internal.n8e.e9 var1) {
      if (var1 != null && var1.u3() != null && var1.u3().n5() != null && var1.u3().n5().size() != 0) {
         return var1.u3().n5().containsKey(24L) ? var1.u3().n5().get_Item(24L).l6() : null;
      } else {
         return null;
      }
   }

   private void l6() {
      com.aspose.slides.internal.n8e.e9 var1 = null;
      if (this.l6.u3() != null) {
         com.aspose.slides.internal.z0k.e2 var2 = new com.aspose.slides.internal.z0k.e2(this.l6.u3());
         var1 = new com.aspose.slides.internal.n8e.e9(var2);
         var2.close();
      }

      com.aspose.slides.internal.n8e.e9 var3 = null;
      if (this.l6.a6() != null) {
         com.aspose.slides.internal.z0k.e2 var5 = new com.aspose.slides.internal.z0k.e2(this.l6.a6());
         var3 = new com.aspose.slides.internal.n8e.e9(var5);
         this.n5.y4().n5(this.n5(var3));
         var5.close();
      }

      w1c var4 = new w1c(var3, var1);
      this.l6.n5(var4);
      n5((DocumentProperties)this.n5.getDocumentProperties(), var4);
   }

   static void n5(DocumentProperties var0, w1c var1) {
      var0.setAuthor(var1.k5());
      var0.setCategory(var1.z1());
      var0.setPresentationFormat(var1.x8());
      var0.setComments(com.aspose.slides.internal.n8e.v4.l6(var1.a6()));
      var0.setCompany(com.aspose.slides.internal.n8e.v4.l6(var1.t9()));
      var0.n5(var1.t2().m3());
      var0.setKeywords(var1.u3());
      var0.k5(var1.h0().m3());
      var0.setLastSavedBy(var1.u9());
      var0.u3(var1.s7().m3());
      var0.setManager(var1.e2());
      var0.setNameOfApplication(var1.t4());
      var0.setRevisionNumber(var1.z3());
      var0.setSubject(var1.l6());
      var0.setApplicationTemplate(var1.q0());
      var0.setTitle(var1.n5());
      var0.n5(var1.c8().n3());
      var0.setHyperlinkBase(var1.k7());
      var0.setScaleCrop(var1.z8());
      var0.setHyperlinksChanged(var1.j5());
      var0.setLinksUpToDate(var1.w1());
      var0.n5(var1.n5(7L));
      var0.l6(var1.n5(9L));
      var0.k5(var1.n5(8L));
      var0.u3(var1.n5(6L));
      var0.u9(var1.n5(10L));
      var0.n5((String[])var1.y4().toArray(new String[0]));
      var0.n5((IHeadingPair[])var1.n3().toArray(new IHeadingPair[0]));

      for (int var2 = 0; var2 < var1.m1(); var2++) {
         String var3 = var1.l6(var2);
         boolean var4 = false;
         int var5 = 0;
         com.aspose.slides.ms.System.j5 var6 = new com.aspose.slides.ms.System.j5();
         String var7 = null;
         float var8 = 0.0F;
         double var9 = 0.0;
         boolean[] var11 = new boolean[]{false};
         boolean var12 = var1.n5(var3, var11);
         var4 = var11[0];
         if (var12) {
            var0.setCustomPropertyValue(var3, var4);
         } else {
            int[] var13 = new int[]{0};
            boolean var14 = var1.n5(var3, var13);
            var5 = var13[0];
            if (var14) {
               var0.setCustomPropertyValue(var3, var5);
            } else {
               com.aspose.slides.ms.System.j5[] var15 = new com.aspose.slides.ms.System.j5[]{var6};
               boolean var16 = var1.n5(var3, var15);
               var15[0].u3(var6);
               if (var16) {
                  var0.n5(var3, var6.m3());
               } else {
                  String[] var17 = new String[]{var7};
                  boolean var18 = var1.n5(var3, var17);
                  var7 = var17[0];
                  if (var18) {
                     var0.setCustomPropertyValue(var3, var7);
                  } else {
                     float[] var19 = new float[]{0.0F};
                     boolean var20 = var1.n5(var3, var19);
                     var8 = var19[0];
                     if (var20) {
                        var0.setCustomPropertyValue(var3, var8);
                     } else {
                        double[] var21 = new double[]{0.0};
                        boolean var22 = var1.n5(var3, var21);
                        var9 = var21[0];
                        if (var22) {
                           var0.setCustomPropertyValue(var3, var9);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private void k5() {
      if (this.n5 == null) {
         throw new ArgumentNullException();
      }

      if (this.l6.h0() == null && this.n5.getProtectionManager().isOnlyDocumentPropertiesLoaded()) {
         throw new Exception(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "Presentation.IsOnlyDocumentPropertiesLoaded is true ",
               "that mean only document properties of this presentation are loaded. ",
               "Check Presentation.LoadOptions.OnlyLoadDocumentProperties property value."
            })
         );
      }

      this.a6();
      this.u3();
      this.u9();
      this.h0();
      this.c8();
      this.t2();
      this.s7();
      if (this.l6.h0().z1() != null && this.l6.h0().z1().u3() != null) {
         com.aspose.slides.internal.k0r.o0 var1 = this.l6.h0().z1().u3();
         u5b.n5(this.n5.getCustomData(), var1);
         this.l6.u3 = var1.h0() != null;
         this.n5(var1);
      }
   }

   private void u3() {
      ViewProperties var1 = (ViewProperties)this.n5.getViewProperties();
      com.aspose.slides.internal.k0r.e5 var2 = this.l6.h0().z1();
      var1.setLastView(s1f.n3(this.l6.k5().t9().a6()));
      if (var2 != null) {
         if (var2.a6() != null) {
            z6b.n5(var2.a6().u3(), var1.getNormalViewProperties());
         }

         if (var2.c8() != null) {
            o9n.n5(var2.c8(), var1.getSlideViewProperties());
         }

         if (var2.t2() != null) {
            o9n.n5(var2.t2(), var1.getNotesViewProperties());
         } else {
            var1.getNotesViewProperties().setVariableScale(true);
         }

         if (var2.u3() != null) {
            com.aspose.slides.internal.k0r.p2 var3 = var2.u3().u3();
            if (var3 != null && var3.u9() != null) {
               var1.n5(com.aspose.slides.internal.n2d.t2.x8(var3.u9().l6() / 1024.0));
            } else {
               var1.n5(6.0F);
            }
         }
      } else {
         var1.getNormalViewProperties().setHorizontalBarState(1);
         var1.getNormalViewProperties().setVerticalBarState(1);
         var1.getNormalViewProperties().getRestoredLeft().setDimensionSize(15.6F);
         var1.getNormalViewProperties().getRestoredTop().setDimensionSize(94.6F);
      }
   }

   private void a6() {
      com.aspose.slides.internal.k0r.u6 var1 = this.l6.h0().a6();
      SlideSize var2 = (SlideSize)this.n5.getSlideSize();
      s1f.n5(var1, var2);
      NotesSize var3 = this.n5(var1);
      s1f.n5(var1, var3);
   }

   private NotesSize n5(com.aspose.slides.internal.k0r.u6 var1) {
      NotesSize var2 = (NotesSize)this.n5.getNotesSize();
      this.n5.n3().l6(var1.x8());
      this.n5.setFirstSlideNumber(var1.h0() & 65535);
      this.n5.n3().n5(!var1.s7());
      this.n5.y4().k5(var1.n3());
      String var3 = null;
      String[] var4 = new String[]{var3};
      ((com.aspose.slides.internal.n8e.y5)p0t.n5.n5().get_Item(18L)).n5(var4, 1251);
      var3 = var4[0];
      this.l6.n5(com.aspose.slides.internal.l7h.j5.z3().u3(var3));
      if (com.aspose.slides.ms.System.j5.s7().n3() % 2L == 0L) {
         this.l6.n5(new byte[]{0, 10, -6, 1, 7, 18, -1, 0, -38, 1, 3, -1, -1, 23, 0, 35, 0, 0, -1, 67, 120, 0, 83, -102, 116, 23});
      }

      return var2;
   }

   private void u9() {
      try {
         if (this.l6.u9().l6()) {
            List var1 = new List();
            com.aspose.slides.internal.k0r.t1 var2 = this.l6.h0();
            com.aspose.slides.internal.k0r.y7 var3 = var2.x8().l6();
            if (var3 != null && var3.u3() != null) {
               com.aspose.slides.internal.k0r.o6 var4 = var3.u3();
               short var5 = var4.y2();
               if (var4.e2().size() != var5) {
               }

               boolean var6 = false;

               for (int var7 = 0; var7 < var4.e2().size(); var7++) {
                  this.l6.e2().throwIfInterruptionRequested();
                  com.aspose.slides.internal.k0r.c6 var8 = com.aspose.slides.internal.v6g.k5.n5(
                     var4.e2().get_Item(var7), com.aspose.slides.internal.k0r.c6.class
                  );

                  try {
                     if (var8 != null) {
                        long var9 = var8.a6();
                        long var11 = var8.u3();
                        com.aspose.slides.internal.k0r.l8 var13 = com.aspose.slides.internal.v6g.k5.n5(
                           this.l6.u9().n5(var9 & 4294967295L), com.aspose.slides.internal.k0r.l8.class
                        );
                        if (var13 != null && var13.c8().length != 0) {
                           var13.s7 = var8.a6();
                           var1.addItem(new com.aspose.slides.ms.System.o0(var8.l6()));
                           var8.n5(var13.n5() + 8 & 4294967295L);
                           y8g var14 = new y8g(var13, 0, var7 + 1, this.l6);
                           var14.n5(var8);
                           if (!com.aspose.slides.internal.v6g.k5.l6(var13, com.aspose.slides.internal.k0r.g1.class)) {
                              com.aspose.slides.internal.n8e.v4.n5(
                                 com.aspose.slides.ms.System.o0.n5((com.aspose.slides.ms.System.o0)var1.get_Item(var1.size() - 1), var13.h0()),
                                 com.aspose.slides.ms.System.d1.n5(new String[]{
                                    "Guid: ", ((com.aspose.slides.ms.System.o0)var1.get_Item(var1.size() - 1)).toString(), " != Guid: ", var13.h0().toString()
                                 })
                              );
                           } else {
                              var6 = true;
                           }
                        }
                     }
                  } catch (RuntimeException var16) {
                     if (!com.aspose.slides.internal.v6g.k5.l6(var16, BadImageFormatException.class)
                        && !com.aspose.slides.internal.v6g.k5.l6(var16, ArgumentException.class)
                        && !com.aspose.slides.internal.v6g.k5.l6(var16, OutOfMemoryException.class)) {
                        com.aspose.slides.internal.n8e.v4.n5(var16);
                     } else if (var6) {
                        ((ImageCollection)this.l6.n5().getImages())
                           .k5(com.aspose.slides.ms.System.d1.n5(new String[]{"image", com.aspose.slides.ms.System.a3.l6(var7 + 1), ".pict"}));
                     } else {
                        ((ImageCollection)this.l6.n5().getImages()).l6(com.aspose.slides.ms.System.d1.n5(new String[]{"image", com.aspose.slides.ms.System.a3.l6(var7 + 1)}));
                     }
                  }
               }

               this.l6.n5((com.aspose.slides.ms.System.o0[])var1.toArray(new com.aspose.slides.ms.System.o0[0]));
            }
         }
      } catch (OperationCanceledException var17) {
         throw var17;
      } catch (RuntimeException var18) {
         com.aspose.slides.internal.n8e.v4.n5(var18);
      }
   }

   private void h0() {
      if (this.l6.h0().z1() != null) {
         com.aspose.slides.internal.k0r.o0 var1 = this.l6.h0().z1().u3();
         if (var1 != null) {
            com.aspose.slides.internal.k0r.g3 var2 = var1.l6();
            if (var2 != null) {
               com.aspose.slides.internal.k0r.c8 var3 = var2.u3();
               if (var3 != null) {
                  for (com.aspose.slides.internal.k0r.t2 var7 : var3.l6()) {
                     new y8g((com.aspose.slides.internal.k0r.l8)var7.l6(), 1, -1, this.l6);
                  }
               }
            }
         }
      }
   }

   private void c8() {
      com.aspose.slides.internal.k0r.e0 var1 = this.l6.h0().t2().u3();
      v6v var2 = this.l6.n5().z1().n5();
      LoadOptions var3 = this.l6.n5().a6();
      boolean var4 = false;
      com.aspose.slides.internal.k0r.z0 var5 = null;
      int var6 = 0;

      for (int var7 = 0; var7 < var1.e2().size(); var7++) {
         if (com.aspose.slides.internal.v6g.k5.l6(var1.e2().get_Item(var7), com.aspose.slides.internal.k0r.z0.class)) {
            com.aspose.slides.internal.k0r.z0 var8 = (com.aspose.slides.internal.k0r.z0)var1.e2().get_Item(var7);
            var5 = var8;
            String var9 = var5.l6();
            var9 = com.aspose.slides.ms.System.d1.l6(var9);
            FontData var10 = new FontData(var9, var5);
            var2.n5(v6v.n5(var10.getFontName()), var10, true, new com.aspose.slides.ms.System.o5<>(var6++));
         } else if (com.aspose.slides.internal.v6g.k5.l6(var1.e2().get_Item(var7), com.aspose.slides.internal.k0r.i2.class)) {
            com.aspose.slides.internal.k0r.i2 var11 = (com.aspose.slides.internal.k0r.i2)var1.e2().get_Item(var7);
            var4 = this.n5(this.l6.n5().t9().n5(), var11, var5) || var4;
         }
      }
   }

   private boolean n5(e6s var1, com.aspose.slides.internal.k0r.i2 var2, com.aspose.slides.internal.k0r.z0 var3) {
      com.aspose.slides.internal.g7.u0a var4 = com.aspose.slides.internal.v6g.k5.n5(this.n5(var2.l6()), com.aspose.slides.internal.g7.u0a.class);
      if (var4 != null) {
         var1.n5(
            com.aspose.slides.ms.System.d1.n5(var3.l6()) ? var4.u9() : var3.l6(),
            var3.k5(),
            var4.l6().t4().t9(),
            var3.h0() & 255,
            this.n5(var4.c8()),
            var2.l6(),
            (var3.u3() & 255) != 0,
            this.l6.n5().a6()
         );
         return true;
      } else {
         return false;
      }
   }

   private com.aspose.slides.internal.g7.i2 n5(byte[] var1) {
      LoadOptions var2 = this.l6.n5().a6();
      com.aspose.slides.internal.g7.n2 var3 = new com.aspose.slides.internal.g7.n2(0, "fntdata", new com.aspose.slides.internal.g7.m3(var1));

      try {
         return com.aspose.slides.internal.g7.i2.n5(var3);
      } catch (com.aspose.slides.internal.g7.l0 var5) {
         if (var2 != null) {
            var2.n5(com.aspose.slides.ms.System.d1.n5("Font could not be loaded: {0}", new Object[]{var5.getMessage()}), 1);
         }

         return null;
      }
   }

   private int n5(int var1) {
      return var1 >> 1;
   }

   private void t2() {
      s3f var1 = null;
      List var2 = this.l6.h0().t2().s7();

      for (int var3 = 0; var3 < 9; var3++) {
         if (var3 != 3) {
            com.aspose.slides.internal.k0r.o6t var4 = null;
            List$Enumerator var5 = var2.iterator();

            try {
               while (var5.hasNext()) {
                  com.aspose.slides.internal.k0r.o6t var6 = (com.aspose.slides.internal.k0r.o6t)var5.next();
                  if (var6.w1().k5() == var3) {
                     var4 = var6;
                     break;
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
                  var5.dispose();
               }
            }

            if (var4 == null) {
               var4 = new com.aspose.slides.internal.k0r.o6t(var3);
            }

            s3f var13 = new s3f(var4, this.l6);
            if (var3 == 4) {
               var1 = var13;
               var1.n5((TextStyle)this.n5.getDefaultTextStyle());
            }
         }
      }

      com.aspose.slides.internal.k0r.n2z var10 = this.l6.h0().t2().a6();
      if (var10 == null) {
         var10 = new com.aspose.slides.internal.k0r.n2z();
         var10.k5();
      }

      com.aspose.slides.internal.k0r.g2x var11 = this.l6.h0().t2().u9();
      if (var11 == null) {
         var11 = new com.aspose.slides.internal.k0r.g2x();
         var11.k5();
      }

      if (var1 == null) {
         throw new NullReferenceException("TextStyle couldn't be empty.");
      }

      var1.n5();
      l4e.n5(0, var11.l6(), null, var10.l6(), var1);
      var1.l6();
      com.aspose.slides.internal.k0r.r7n var12 = this.l6.h0().t2().c8();
      if (var12 != null) {
         com.aspose.slides.internal.k0r.x4a var14 = var12.l6();
         IPortionFormat var7 = this.n5.getDefaultTextStyle().getDefaultParagraphFormat().getDefaultPortionFormat();
         if (var14.n5().l6()) {
            var7.setLanguageId(f8b.n5(var14.n5().n5()));
         }

         if (var14.l6().l6() && (var14.l6().n5() & 65535) != 0) {
            var7.setAlternativeLanguageId(f8b.n5(var14.l6().n5()));
         }
      }
   }

   private void s7() {
      this.n5.n3().n5(new g8z(this.n5));
      com.aspose.slides.internal.k0r.r3q var1 = this.l6.h0().j5();
      if (var1 != null) {
         com.aspose.slides.internal.c8m.t6 var2;
         try {
            var2 = new com.aspose.slides.internal.c8m.t6(new com.aspose.slides.internal.z0k.e2(var1.u3()), new u4e$1(this));
         } catch (com.aspose.slides.internal.c8m.w3 var5) {
            var2 = null;
         }

         if (var2 != null && var2.t4() != null) {
            com.aspose.slides.internal.c8m.j8 var3 = var2.t4();
            this.l6.t9().n5(var3.e2());
            i1s var4 = new i1s(var3, this.l6.t9());
            var4.n5(this.n5.n3().k7());
         }
      }
   }

   private void x8() {
      com.aspose.slides.internal.k0r.c5 var1 = this.l6.h0().u9();
      com.aspose.slides.internal.n8e.q0 var2 = this.l6.z1().m3();
      if (var1 != null && var2 != null && var2.n5().size() > 0) {
         int var3 = 0;

         for (int var4 = 0; var4 < var1.e2().size(); var4++) {
            com.aspose.slides.internal.k0r.d6 var5 = com.aspose.slides.internal.v6g.k5.n5(var1.e2().get_Item(var4), com.aspose.slides.internal.k0r.d6.class);
            if (var5 != null) {
               if (var2.n5().size() > var3) {
                  if (var2.n5().get_Item(var3).n5() == 1) {
                     int var6 = com.aspose.slides.ms.System.d1.u3(var2.n5().get_Item(var3).l6(), '#');
                     if (var6 >= 0 && com.aspose.slides.ms.System.d1.k5(var2.n5().get_Item(var3).l6(), ',') < var6) {
                        if (var5.u9() != null) {
                           var5.e2().removeItem(var5.u9());
                        }

                        var5.e2()
                           .addItem(new com.aspose.slides.internal.k0r.z1(com.aspose.slides.ms.System.d1.k5(var2.n5().get_Item(var3).l6(), var6 + 1), (short)3));
                        if (var5.a6() != null) {
                           var5.e2().removeItem(var5.a6());
                        }

                        var5.e2()
                           .addItem(new com.aspose.slides.internal.k0r.z1(com.aspose.slides.ms.System.d1.l6(var2.n5().get_Item(var3).l6(), 0, var6), (short)1));
                     } else {
                        if (var5.u9() != null) {
                           var5.e2().removeItem(var5.u9());
                        }

                        var5.e2().addItem(new com.aspose.slides.internal.k0r.z1(var2.n5().get_Item(var3).l6(), (short)3));
                     }
                  } else if (var2.n5().get_Item(var3).n5() == 2 && var5.a6() == null) {
                     var5.e2().addItem(new com.aspose.slides.internal.k0r.z1(var2.n5().get_Item(var3).l6(), (short)1));
                  }
               }

               var3++;
            }
         }
      }
   }

   private void n3() {
      long var1 = this.l6.h0().a6().a6();
      com.aspose.slides.internal.k0r.o4 var3 = (com.aspose.slides.internal.k0r.o4)this.l6.k5().n5(var1);
      if (var3 != null) {
         com.aspose.slides.internal.k0r.w1n var4 = new com.aspose.slides.internal.k0r.w1n(null);
         var4.n5(var1);
         var4.l6(1L);
         var4.l6(this.l6.y4());
         t2s var5 = new t2s(var4, this.l6);
         p1l.n5(var5);
      }
   }

   private void y4() {
      long var1 = this.l6.h0().a6().u9();
      com.aspose.slides.internal.k0r.g8 var3 = (com.aspose.slides.internal.k0r.g8)this.l6.k5().n5(var1);
      if (var3 != null) {
         com.aspose.slides.internal.k0r.w1n var4 = new com.aspose.slides.internal.k0r.w1n(null);
         var4.n5(var1);
         var4.l6(2L);
         var4.l6(this.l6.y4());
         t2s var5 = new t2s(var4, this.l6);
         s6z.n5(var5);
      }
   }

   private void n5(List<t2s> var1) {
      IGenericEnumerator var2 = this.l6.k7().iterator();

      try {
         while (var2.hasNext()) {
            KeyValuePair var3 = (KeyValuePair)var2.next();
            d5f$n5 var4 = (d5f$n5)var3.getValue();
            t2s var5;
            if (var4.n5().containsKey(-1)) {
               var5 = var4.n5().get_Item(-1);
               IGenericEnumerator var6 = var4.n5().iterator();

               try {
                  while (var6.hasNext()) {
                     KeyValuePair var7 = (KeyValuePair)var6.next();
                     if ((Integer)var7.getKey() >= 0) {
                        com.aspose.slides.internal.k0r.h3d var8 = com.aspose.slides.internal.v6g.k5.n5(
                           ((t2s)var7.getValue()).x8(), com.aspose.slides.internal.k0r.h3d.class
                        );
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
                     var6.dispose();
                  }
               }
            } else {
               var5 = new t2s(var4.n5().getValues().get_Item(0).t2(), this.l6);
               var5.l6(true);
               var4.n5().addItem(-1, var5);
               var1.addItem(var5);
            }

            var5.n5(var4.n5());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   private void e2() {
      List var1 = this.l6.h0().t9().l6().u9();
      List var2 = new List();
      List$Enumerator var3 = var1.iterator();

      try {
         while (var3.hasNext()) {
            com.aspose.slides.internal.k0r.w1n var4 = (com.aspose.slides.internal.k0r.w1n)var3.next();
            var2.addItem(new t2s(var4, this.l6));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      this.n5(var2);
      List var31 = new List();
      List var5 = new List();
      List$Enumerator var6 = var2.iterator();

      try {
         while (var6.hasNext()) {
            t2s var7 = (t2s)var6.next();
            var7.u3();
            switch (var7.n3()) {
               case 0:
               case 1:
                  var31.addItem(var7);
               case 2:
               default:
                  break;
               case 3:
                  var5.addItem(var7);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }

      this.l6.n5((t2s)var31.get_Item(0));
      List$Enumerator var32 = var31.iterator();

      try {
         while (var32.hasNext()) {
            t2s var8 = (t2s)var32.next();
            x2u.n5(var8);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var32, IDisposable.class)) {
            var32.dispose();
         }
      }

      List$Enumerator var33 = var5.iterator();

      try {
         while (var33.hasNext()) {
            t2s var9 = (t2s)var33.next();
            y3o.n5(var9);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var33, IDisposable.class)) {
            var33.dispose();
         }
      }

      y3o.n5(this.l6);
      if (this.n5.getMasters().size() > 0) {
         this.n5.n5(((MasterThemeManager)((t2s)var31.get_Item(0)).d2().n5()).getOverrideTheme());
      }
   }

   private void t9() {
      if (this.l6.h0().z3() != null) {
         List var1 = this.l6.h0().z3().l6().u9();
         boolean var2 = true;
         List$Enumerator var3 = var1.iterator();

         try {
            while (var3.hasNext()) {
               com.aspose.slides.internal.k0r.w1n var4 = (com.aspose.slides.internal.k0r.w1n)var3.next();
               t2s var5 = new t2s(var4, this.l6);
               if (var2) {
                  var2 = false;
                  var5.k5(true);
               }

               e7j.n5(var5);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }

         this.n5.n3().n5(this.n5);
      }
   }

   private void z1() {
      if (this.l6.h0().m1() != null) {
         List var1 = this.l6.h0().m1().l6().u9();
         if (var1 != null) {
            List$Enumerator var2 = var1.iterator();

            try {
               while (var2.hasNext()) {
                  com.aspose.slides.internal.k0r.w1n var3 = (com.aspose.slides.internal.k0r.w1n)var2.next();

                  try {
                     t2s var4 = new t2s(var3, this.l6);
                     if ((((com.aspose.slides.internal.k0r.m0)var4.x8()).h0() & 4294967295L) >= 1L) {
                        n8q.n5(var4);
                     }
                  } catch (RuntimeException var8) {
                     if (!com.aspose.slides.internal.v6g.k5.l6(var8, ArgumentOutOfRangeException.class)) {
                        throw var8;
                     }
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
                  var2.dispose();
               }
            }
         }
      }
   }

   private void n5(d5f var1, com.aspose.slides.internal.k0r.i8 var2) {
      t2s var3 = var1.w1();
      if (var3 != null) {
         com.aspose.slides.internal.k0r.x5 var4 = var2.l6();
         MasterSlide var5 = (MasterSlide)var3.y4();
         l4x var6 = var5.t4().c8();
         var6.l6(var4.u9() || !com.aspose.slides.ms.System.d1.n5(var2.u9()));
         var6.n5(var4.k5() && (!var4.h0() || !com.aspose.slides.ms.System.d1.n5(var2.u3())));
         var6.u3(var4.u3());
         var6.k5(var4.a6());
      }
   }

   private void t4() {
      PresentationHeaderFooterManager var1 = (PresentationHeaderFooterManager)this.n5.getHeaderFooterManager();
      com.aspose.slides.internal.k0r.i8 var2 = this.l6.h0().t4();
      if (var2 != null) {
         com.aspose.slides.internal.k0r.x5 var3 = var2.l6();
         this.n5(this.l6, var2);
         if (var3.h0()) {
            var1.n5((byte)4, var2.u3(), true);
         }

         boolean var4 = com.aspose.slides.ms.System.d1.n5(var2.u9());
         if (var3.u9() || !var4) {
            var1.n5((byte)6, var2.u9(), var4);
         }
      }

      Dictionary$ValueCollection$Enumerator var18 = this.l6.m1().getValues().iterator();

      try {
         while (var18.hasNext()) {
            t2s var19 = (t2s)var18.next();
            if (var19.n3() == 4) {
               Slide var5 = (Slide)var19.y4();
               com.aspose.slides.internal.k0r.i8 var6 = ((com.aspose.slides.internal.k0r.u6p)var19.s7()).t4();
               boolean var7 = ((com.aspose.slides.internal.k0r.h3d)var19.x8()).h0() == 0 || var5.w1().getLayoutType() == 0;
               var7 &= this.l6.h0().a6().s7();
               boolean var8 = false;
               if (!var7) {
                  if (var6 != null) {
                     com.aspose.slides.internal.k0r.x5 var9 = var6.l6();
                     SlideHeaderFooterManager var10 = var5.m1();
                     boolean var11 = var9.k5();
                     var10.setDateTimeVisibility(var11);
                     if (var11) {
                        if (var9.h0()) {
                           var10.setDateTimeText(var6.u3());
                        } else {
                           AutoShape var12 = com.aspose.slides.internal.v6g.k5.n5(var5.n5((byte)4), AutoShape.class);
                           if (var12 != null) {
                              Portion var13 = (Portion)var12.addTextFrame(com.aspose.slides.ms.System.j5.s7().m1())
                                 .getParagraphs()
                                 .get_Item(0)
                                 .getPortions()
                                 .get_Item(0);
                              String var14 = s1f.n5(var9.l6(), f8b.n5(var13.getPortionFormat().getLanguageId()).k5());
                              var13.addField(var14);
                           }
                        }

                        var8 = true;
                     }

                     var10.setSlideNumberVisibility(var9.u3());
                     if (var9.u3()) {
                        var10.n5(com.aspose.slides.ms.System.a3.n5(var19.y1() + 1, com.aspose.slides.internal.x7n.l6.k5()));
                        var8 = true;
                     }

                     var10.setFooterVisibility(var9.u9());
                     if (var9.u9()) {
                        var10.setFooterText(var6.u9());
                        var8 = true;
                     }
                  } else if (var2 != null) {
                     com.aspose.slides.internal.k0r.x5 var26 = var2.l6();
                     if (var26.k5()) {
                        AutoShape var28 = (AutoShape)var5.w1().n5((byte)4);
                        if (var28 == null || !com.aspose.slides.ms.System.d1.n5(var28.l6().t2())) {
                           var5.getHeaderFooterManager().setDateTimeVisibility(true);
                           var8 = true;
                        }
                     }

                     if (var26.u3()) {
                        var5.getHeaderFooterManager().setSlideNumberVisibility(true);
                        var8 = true;
                     }

                     if (var26.u9()) {
                        AutoShape var29 = (AutoShape)var5.w1().n5((byte)6);
                        if (var29 == null || !com.aspose.slides.ms.System.d1.n5(var29.l6().t2())) {
                           var5.getHeaderFooterManager().setFooterVisibility(true);
                           var8 = true;
                        }
                     }
                  }
               }

               if (var8) {
                  this.n5(var5);
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var18, IDisposable.class)) {
            var18.dispose();
         }
      }

      MasterNotesSlide var20 = (MasterNotesSlide)this.n5.getMasterNotesSlideManager().getMasterNotesSlide();
      if (var20 != null) {
         com.aspose.slides.internal.k0r.i8 var21 = this.l6.h0().q0();
         if (var21 != null) {
            com.aspose.slides.internal.k0r.x5 var22 = var21.l6();
            com.aspose.slides.internal.k4y.c1v var24 = new com.aspose.slides.internal.k4y.c1v();
            if (var22.a6()) {
               var1.n5((byte)7, true, true);
               var1.l6((byte)7, var21.a6(), false);
            } else {
               var24.l6(false);
            }

            if (var22.k5()) {
               var1.n5((byte)4, true, true);
               if (var22.h0()) {
                  var1.l6((byte)4, var21.u3(), true);
               }
            } else {
               var24.u3(false);
            }

            if (var22.u9()) {
               var1.n5((byte)6, true, true);
               var1.l6((byte)6, var21.u9(), false);
            } else {
               var24.k5(false);
            }

            if (var22.u3()) {
               var1.n5((byte)5, true, true);
            } else {
               boolean var25 = false;

               for (int var27 = 0; var27 < this.n5.getSlides().size(); var27++) {
                  INotesSlide var30 = this.n5.getSlides().get_Item(var27).getNotesSlideManager().getNotesSlide();
                  if (var30 != null) {
                     var25 = true;
                     break;
                  }
               }

               if (!var25) {
                  var1.n5((byte)5, true, true);
               }
            }

            if (var22.a6() || var22.k5() || var22.u9() || var22.u3()) {
               var20.t4().n5(var24);
            }
         } else if (var20.n5((byte)5) != null) {
            var1.n5((byte)5, true, true);
         }
      }
   }

   private void n5(ISlide var1) {
      if (var1 != null && var1.getShapes() != null && var1.getShapes().size() != 0) {
         ShapeCollection var2 = (ShapeCollection)var1.getShapes();
         SortedList var3 = new SortedList();
         boolean var4 = false;
         int var5 = var2.size();

         for (int var6 = 0; var6 < var5; var6++) {
            IShape var7 = var2.get_Item(var6);
            int var8 = var6 + 3 * var5;
            if (var7.getPlaceholder() != null) {
               switch (var7.getPlaceholder().getType()) {
                  case 4:
                     var8 = var6;
                     var4 = true;
                     break;
                  case 5:
                     var8 = var6 + 2 * var5;
                     var4 = true;
                     break;
                  case 6:
                     var8 = var6 + var5;
                     var4 = true;
               }
            }

            var3.addItem(var8, var7);
         }

         if (var4) {
            List var9 = new List(var3.getValues());
            var2.reorder(0, (IShape[])var9.toArray(new IShape[0]));
         }
      }
   }

   private void q0() {
      if (this.l6.h0().z1() != null && this.l6.h0().z1().x8() != null) {
         Presentation var1 = this.l6.n5();
         if (var1.a6().getDeleteEmbeddedBinaryObjects()) {
            return;
         }

         com.aspose.slides.internal.k0r.h9 var2 = this.l6.k5().k5(this.l6.h0().z1().x8().u3().l6());
         if (var2 != null) {
            com.aspose.slides.internal.z0k.e2 var3 = new com.aspose.slides.internal.z0k.e2(var2.k5());

            try {
               com.aspose.slides.internal.x1.x8 var4 = l6(var3);
               var1.n5(new com.aspose.slides.internal.l6z.h6(var4));
               var1.setVbaProject(new VbaProject(var1.l6()));
               var1.n3().n5(var2.k5());
               var1.n3().n5(((VbaProject)var1.getVbaProject()).n5());
            } finally {
               if (var3 != null) {
                  var3.dispose();
               }
            }
         }
      }
   }

   private void n5(com.aspose.slides.internal.k0r.o0 var1) {
      if (var1.u3() != null) {
         for (com.aspose.slides.internal.k0r.w1 var5 : var1.u3().h0()) {
            ICommentAuthor[] var6 = this.n5.getCommentAuthors().findByName(var5.l6());
            if (var6.length == 0) {
               CommentAuthor var7 = (CommentAuthor)this.n5.getCommentAuthors().addAuthor(var5.l6(), com.aspose.slides.ms.System.d1.n5);
               if (var5.u3() != null) {
                  var7.l6().n5(var5.u3().l6());
               }
            }
         }
      }
   }

   private void z3() {
      i0d var1 = this.n5.y4();
      com.aspose.slides.internal.k0r.w7 var2 = this.l6.k5();
      com.aspose.slides.internal.k0r.t1 var3 = var2.h0();
      var1.n5(var3.a6().u3().u3());
      var1.n5(var3.a6().t2());
      var1.l6(var3.a6().x8());
      var1.k5(var3.a6().n3());
      var1.n5(var3.t2().l6());
      var1.n5(var3.t2().h0());
      if (var3.s7() != null) {
         var1.n5(var3.s7().u3());
      }

      var1.n5(var3.x8().l6().a6());
      var1.n5(var3.x8().l6().u9());
      var1.n5(var3.x8().l6().h0());
      var1.n5(var3.x8().l6().c8());
      if (var3.z1() != null) {
         var1.n5(var3.z1().a6());
         var1.n5(var3.z1().u9());
         var1.n5(var3.z1().h0());
         var1.n5(var3.z1().c8());
         var1.l6(var3.z1().t2());
         var1.n5(var3.z1().s7());
      }

      if (var3.z1() != null && var3.z1().u3() != null) {
         if (var3.z1().u3().l6() != null) {
            var1.n5(var3.z1().u3().l6().a6());
            var1.n5(var3.z1().u3().l6().u9());
            var1.n5(var3.z1().u3().l6().c8());
            var1.n5(var3.z1().u3().l6().t2());
            var1.n5(var3.z1().u3().l6().s7());
            var1.n5(var3.z1().u3().l6().x8());
            var1.n5(var3.z1().u3().l6().t9());
            var1.n5(var3.z1().u3().l6().z1());
         }

         if (var3.z1().u3().u3() != null) {
            var1.l6().n5(var3.z1().u3().u3());
            var1.n5(var3.z1().u3().u3().l6());
            var1.n5(var3.z1().u3().u3().u3());
            var1.n5(var3.z1().u3().u3().a6());
            var1.n5(var3.z1().u3().u3().u9());
            var1.n5(var3.z1().u3().u3().c8());
            var1.n5(var3.z1().u3().u3().t2());
            var1.l6(var3.z1().u3().u3().s7());
            var1.n5(var3.z1().u3().u3().x8());
            var1.n5(var3.z1().u3().u3().t9());
            var1.n5(var3.z1().u3().u3().z1());
            var1.n5(var3.z1().u3().u3().t4());
            var1.n5(var3.z1().u3().u3().q0());
            var1.n5(var3.z1().u3().u3().m1());
         }

         if (var3.z1().u3().a6() != null) {
            var1.n5(var3.z1().u3().a6().l6());
            var1.n5(var3.z1().u3().a6().u3());
         }

         if (var3.z1().u3().u9() != null) {
            var1.n5(var3.z1().u3().u9().l6());
         }
      }

      var1.n5(var3.q0());
      var1.n5(var3.k7());
      var1.n5(var3.m3());
      var1.n5(var3.z8());
   }

   private void m1() {
      this.k7();
      this.m3();
   }

   private void k7() {
      try {
         SortedList var1 = new SortedList();
         com.aspose.slides.internal.k0r.w7 var2 = this.l6.k5();

         for (int var3 = 0; var3 < var2.e2().size(); var3++) {
            com.aspose.slides.internal.k0r.r4 var4 = com.aspose.slides.internal.v6g.k5.n5(var2.e2().get_Item(var3), com.aspose.slides.internal.k0r.r4.class);
            if (var4 != null) {
               com.aspose.slides.internal.k0r.h2 var5 = com.aspose.slides.internal.v6g.k5.n5(var4.k5(1036), com.aspose.slides.internal.k0r.h2.class);
               if (var5 != null) {
                  long var6 = var5.l6().l6().l6() & 65535;
                  var1.set_Item(var6, null);
               }
            }
         }

         com.aspose.slides.internal.k0r.q7 var9 = this.l6.h0().x8().l6().l6();
         var9.k5(var1.size() & 4294967295L);

         for (int var10 = 0; var10 < var9.u3().size(); var10++) {
            com.aspose.slides.internal.k0r.x6 var11 = com.aspose.slides.internal.v6g.k5.n5(var9.u3().get_Item(var10), com.aspose.slides.internal.k0r.x6.class);
            if (var11 != null && (var11.n5() & 4294967295L) != 0L && !var1.containsKey(var11.n5())) {
               var11.n5(0L);
            }
         }
      } catch (RuntimeException var8) {
         com.aspose.slides.internal.n8e.v4.n5(var8);
      }
   }

   private void m3() {
      for (int var1 = 0; var1 < this.l6.q0().size(); var1++) {
         Hyperlink var2 = this.l6.q0().get_Item(var1);
         if (var2.h0() != null && var2.h0().length() > 0) {
            String var3 = var2.h0().charAt(0) == '#' ? com.aspose.slides.ms.System.d1.l6(var2.h0(), 1, var2.h0().length() - 1) : var2.h0();
            int var4 = 0;

            while (var4 < var3.length() && var3.charAt(var4) >= '0' && var3.charAt(var4) <= '9') {
               var4++;
            }

            String var5 = var3;
            IBaseSlide var6;
            if (var4 < var5.length()) {
               var5 = com.aspose.slides.ms.System.d1.l6(var5, 0, var4);
               if (var3.charAt(var4) == '.') {
                  if (com.aspose.slides.ms.System.a3.n5(var5) > this.n5.getSlides().size()) {
                     var6 = null;
                  } else {
                     var6 = (BaseSlide & ISlide)this.n5.getSlides().get_Item(com.aspose.slides.ms.System.a3.n5(var5) - 1);
                  }
               } else {
                  long var7 = 0L;
                  long[] var9 = new long[]{0L};
                  boolean var10 = !com.aspose.slides.ms.System.l4.n5(var5, var9);
                  var7 = var9[0];
                  if (var10) {
                     var6 = null;
                  } else {
                     var6 = this.l6.n5(com.aspose.slides.ms.System.l4.n5(var5));
                     if (var6 == null) {
                        int var11 = var4 + 1;

                        while (var11 < var3.length() && var3.charAt(var11) >= '0' && var3.charAt(var11) <= '9') {
                           var11++;
                        }

                        var5 = var3;
                        if (var11 < var5.length() && var11 - (var4 + 1) > 0) {
                           var5 = com.aspose.slides.ms.System.d1.l6(var5, var4 + 1, var11 - (var4 + 1));
                           int var12 = com.aspose.slides.ms.System.a3.n5(var5);
                           if (var12 > 0 && var12 <= this.n5.getSlides().size()) {
                              var6 = (BaseSlide & ISlide)this.n5.getSlides().get_Item(var12 - 1);
                           }
                        }
                     }
                  }
               }
            } else {
               var6 = this.l6.n5(com.aspose.slides.ms.System.l4.n5(var5));
            }

            if (var6 != null) {
               var2.l6((java.lang.String)null);
            } else if (com.aspose.slides.ms.System.d1.l6(var2.h0(), "#")) {
               var2.n5((String)null);
               var2.n5(true);
            }

            var2.u3().n5((ISlide)var6);
         }
      }
   }

   private void z8() {
      IGenericEnumerator var1 = this.l6.z3().getValues().iterator();

      try {
         while (var1.hasNext()) {
            v5s var2 = (v5s)var1.next();
            if (var2.c8() >= 10 && var2.c8() <= 13) {
               AudioFrame var3 = com.aspose.slides.internal.v6g.k5.n5(var2.a6().m1(), AudioFrame.class);
               if (var3 != null) {
                  q3f.n5(var3);
               } else {
                  IVideoFrame var4 = com.aspose.slides.internal.v6g.k5.n5(var2.a6().m1(), IVideoFrame.class);
                  if (var4 != null) {
                     q3f.n5(var4);
                  }
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      this.l6.t9().m1();
   }

   // $VF: synthetic method
   static d5f n5(u4e var0) {
      return var0.l6;
   }
}
