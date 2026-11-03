package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.IDisposable;

class n0r {
   private static final boolean[] n5 = new boolean[9];
   private static final boolean[] l6 = new boolean[9];

   private static void n5(IPresentation var0, IPresentation var1, int var2, com.aspose.slides.internal.c8m.d9[] var3, g6c[] var4, t5w[] var5) {
      var3[0] = new com.aspose.slides.internal.c8m.d9();
      var4[0] = new g6c(var3[0], var0, null, null, InterruptionToken.getNone());
      var5[0] = new t5w(var1, InterruptionToken.getNone());
      var5[0].n5(var2);
      var4[0].n5(n5(var0, var1, var5[0]));
   }

   public static ISlide n5(IPresentation var0, ILayoutSlide var1, ISlide var2) {
      if (var2 == null) {
         return null;
      }

      com.aspose.slides.internal.c8m.d9 var3 = null;
      g6c var4 = null;
      t5w var5 = null;
      com.aspose.slides.internal.c8m.d9[] var6 = new com.aspose.slides.internal.c8m.d9[]{var3};
      g6c[] var7 = new g6c[]{var4};
      t5w[] var8 = new t5w[]{var5};
      n5(var2.getPresentation(), var0, 1, var6, var7, var8);
      var3 = var6[0];
      var4 = var7[0];
      var5 = var8[0];
      com.aspose.slides.internal.c8m.j8 var9 = null;
      com.aspose.slides.internal.c8m.j8 var10 = null;
      var4.l6().addItem(var2, com.aspose.slides.ms.System.d1.n5(new String[]{"/ppt/slides/slide", com.aspose.slides.ms.System.a3.l6(var4.d5()), ".xml"}));
      com.aspose.slides.internal.c8m.j8 var11 = e1e.n5(var3, var2, var4);
      if (var2.getNotesSlideManager().getNotesSlide() != null && var0.getMasterNotesSlideManager().getMasterNotesSlide() == null) {
         var9 = e1e.n5(var3, var2.getPresentation(), var4);
      }

      if (var2.getThemeManager().isOverrideThemeEnabled()) {
         e1e.n5(var2.getThemeManager().getOverrideTheme(), var4);
         var10 = var4.u3().get_Item(var2.getThemeManager().getOverrideTheme());
      }

      if (var4.h0() == 2) {
         n5(var2, var0);
      }

      var4.n5(var5);
      Slide var12 = ((SlideCollection)var0.getSlides()).n5();
      w5r var13 = new w5r(var11, var5);
      var13.n5(var12);
      var5.x8().addItem(var11.l6(), var12);
      com.aspose.slides.internal.c8m.r7[] var14 = var11.e2().n5(com.aspose.slides.internal.c8m.u4.n5);
      if (var14 != null && var14.length > 0) {
         if (var9 != null) {
            p3r var15 = new p3r(var9, var5);
            MasterNotesSlide var16 = ((i6f)var0.getMasterNotesSlideManager()).n5();
            var15.n5(var16);
            var5.x8().addItem(var9.l6(), var16);
         }

         n3e var20 = new n3e(var14[0].l6(), var5);
         var20.n5(((NotesSlideManager)var12.getNotesSlideManager()).n5(false));
      }

      var12.n5(
         (LayoutSlide)var1,
         var2.getLayoutSlide().getLayoutType() != var1.getLayoutType() || !com.aspose.slides.ms.System.d1.a6(var2.getLayoutSlide().getName(), var1.getName())
      );
      if (var4.h0() == 2) {
         n5((ISlide)var12, var2);
         n5(var12, var2);
      }

      if (var10 != null) {
         x8c var21 = new x8c(var10, var5);
         var21.n5(var12.getThemeManager());
      }

      ((SlideCollection)var0.getSlides()).n5(var12);
      q3f.n5(var3, var0, var5);
      q3f.k5(var3, var0, var5);
      if (!com.aspose.slides.ms.System.j8.l6((Presentation)var0, (Presentation)var2.getPresentation())) {
         n5(var12.getShapes(), var2.getShapes());
      }

      return var12;
   }

   private static void n5(Slide var0, ISlide var1) {
      for (int var2 = 0; var2 < var0.getShapes().size(); var2++) {
         Shape var3 = (Shape)var0.getShapes().get_Item(var2);
         IPlaceholder var4 = var3.getPlaceholder();
         if (var4 != null && var4.getIndex() == 4294967295L && (var3.s3() == null || var3.s3().u9())) {
            Shape var5 = (Shape)var1.getShapes().get_Item(var2);
            n5(var3, var5, null);
         }
      }
   }

   static void n5(IShapeCollection var0, IShapeCollection var1) {
      int var2 = com.aspose.slides.ms.System.q1.l6(var0.size(), var1.size());

      for (int var3 = 0; var3 < var2; var3++) {
         if (com.aspose.slides.internal.v6g.k5.l6(var1.get_Item(var3), GroupShape.class)
            && com.aspose.slides.internal.v6g.k5.l6(var0.get_Item(var3), GroupShape.class)) {
            n5(((GroupShape)var0.get_Item(var3)).getShapes(), ((GroupShape)var1.get_Item(var3)).getShapes());
         } else {
            AutoShape var4 = com.aspose.slides.internal.v6g.k5.n5(var1.get_Item(var3), AutoShape.class);
            AutoShape var5 = com.aspose.slides.internal.v6g.k5.n5(var0.get_Item(var3), AutoShape.class);
            if (var4 != null && var5 != null && var4.getTextFrame() != null && var4.getShapeStyle() != null) {
               r0s var6 = null;
               r0s[] var7 = new r0s[]{var6};
               IParagraphFormat[] var8 = ((TextFrame)var4.getTextFrame()).n5(var7);
               var6 = var7[0];
               if (var6 != null) {
                  TextStyle var9 = (TextStyle)var5.getTextFrame().getTextFrameFormat().getTextStyle();

                  for (int var10 = 0; var10 < var8.length; var10++) {
                     IParagraphFormat var11 = var9.l6(var10);
                     if (PortionFormat.u3((PortionFormat)var11.getDefaultPortionFormat())) {
                        if (var8[var10] != null) {
                           var11.getDefaultPortionFormat().setLanguageId(var8[var10].getDefaultPortionFormat().getLanguageId());
                           var11.getDefaultPortionFormat().setLatinFont(var8[var10].getDefaultPortionFormat().getLatinFont());
                        }

                        IFillFormat var12 = var11.getDefaultPortionFormat().getFillFormat();
                        var12.setFillType((byte)1);
                        var12.getSolidFillColor().setColorType(0);
                        ((ColorFormat)var12.getSolidFillColor()).n5(var6.n5().o8());
                     }
                  }
               }
            }
         }
      }
   }

   private static void n5(ISlide var0, ISlide var1) {
      IComment[] var2 = var1.getSlideComments(null);
      Dictionary var3 = new Dictionary();
      if (var2.length > 0) {
         Dictionary var4 = new Dictionary();
         ICommentAuthorCollection var5 = var0.getPresentation().getCommentAuthors();

         for (int var6 = 0; var6 < var2.length; var6++) {
            Comment var7 = (Comment)var2[var6];
            ICommentAuthor var8 = var7.getAuthor();
            ICommentAuthor var9 = null;
            ICommentAuthor[] var10 = new ICommentAuthor[]{var9};
            boolean var11 = !var4.tryGetValue(var8, var10);
            var9 = var10[0];
            if (var11) {
               ICommentAuthor[] var12 = var5.findByNameAndInitials(var8.getName(), var8.getInitials());
               if (var12.length > 0) {
                  var9 = var12[var12.length - 1];
               } else {
                  var9 = var5.addAuthor(var8.getName(), var8.getInitials());
               }

               var4.set_Item(var7.getAuthor(), var9);
            }

            if (com.aspose.slides.internal.v6g.k5.l6(var7, ModernComment.class)) {
               ModernComment var16 = (ModernComment)((CommentCollection)var9.getComments())
                  .n5(var7.getText(), var0, ((ModernComment)var7).getShape(), var7.l6().u3(), var7.n5().m3());
               var16.setStatus(((ModernComment)var7).getStatus());
               var16.setTextSelectionStart(((ModernComment)var7).getTextSelectionStart());
               var16.setTextSelectionLength(((ModernComment)var7).getTextSelectionLength());
               var16.u9().n5(((ModernComment)var7).u9().n5());
               var16.u9().l6(((ModernComment)var7).u9().l6());
               var3.addItem(var7, var16);
            } else if (com.aspose.slides.internal.v6g.k5.l6(var7, Comment.class)) {
               Comment var17 = (Comment)((CommentCollection)var9.getComments()).n5(var7.getText(), var0, var7.l6().u3(), var7.n5().m3());
            }
         }

         for (int var13 = 0; var13 < var3.size(); var13++) {
            Comment var14 = (Comment)var2[var13];
            if (com.aspose.slides.internal.v6g.k5.l6(var14, ModernComment.class) && var14.getParentComment() != null) {
               ((IComment)var3.get_Item(var14)).setParentComment((IComment)var3.get_Item(var14.getParentComment()));
            }
         }
      }
   }

   private static void n5(IBaseSlide var0, IPresentation var1) {
      g8z var2 = ((Presentation)var0.getPresentation()).z8();
      if (var2 != null && var2.n5().n5().size() > 0) {
         g8z var3 = ((Presentation)var1).z8();
         IGenericEnumerator var4 = var0.getShapes().iterator();

         try {
            while (var4.hasNext()) {
               Shape var5 = (Shape)var4.next();
               Table var6 = com.aspose.slides.internal.v6g.k5.n5(var5, Table.class);
               if (var6 != null && var6.u9() != null && var2.n5(var6.u9().n5().n5().k5()) != null && var3.n5(var6.u9().n5().n5().k5()) == null) {
                  var3.n5(var6.u9());
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }
      }
   }

   public static ILayoutSlide n5(IMasterSlide var0, ILayoutSlide var1) {
      if (var1 == null) {
         return null;
      }

      Presentation var2 = (Presentation)var0.getPresentation();
      com.aspose.slides.internal.c8m.d9 var3 = null;
      g6c var4 = null;
      t5w var5 = null;
      com.aspose.slides.internal.c8m.d9[] var6 = new com.aspose.slides.internal.c8m.d9[]{var3};
      g6c[] var7 = new g6c[]{var4};
      t5w[] var8 = new t5w[]{var5};
      n5(var1.getPresentation(), var2, 1, var6, var7, var8);
      var3 = var6[0];
      var4 = var7[0];
      var5 = var8[0];
      com.aspose.slides.internal.c8m.j8 var9 = e1e.n5(var3, var1, null, var4);
      if (var4.h0() == 2) {
         n5(var1, var2);
      }

      var4.n5(var5);
      ILayoutSlide var10 = null;
      p8c var11 = new p8c(var9, var5);
      ILayoutSlide[] var12 = new ILayoutSlide[]{var10};
      var11.n5(var0, var12);
      var10 = var12[0];
      ((LayoutSlide)var10).k5().n5(var2.n3().w1());
      var5.x8().addItem(var9.l6(), var10);
      ILayoutSlide var13 = var10;
      IMasterSlide var14 = var13.getMasterSlide();
      List var15 = new List();
      IGenericEnumerator var16 = var14.getLayoutSlides().iterator();

      try {
         while (var16.hasNext()) {
            ILayoutSlide var17 = (ILayoutSlide)var16.next();
            if (var17 != var13) {
               var15.addItem(var17.getName());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var16, IDisposable.class)) {
            var16.dispose();
         }
      }

      List var26 = var15;
      String var18 = var13.getName();

      for (int var19 = 1; var26.containsItem(var13.getName()); var19++) {
         var13.setName(com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.a3.l6(var19), "_", var18}));
      }

      q3f.n5(var3, var2, var5);
      q3f.k5(var3, var2, var5);
      if (!com.aspose.slides.ms.System.j8.l6(var2, (Presentation)var1.getPresentation())) {
         n5(var10.getShapes(), var1.getShapes());
      }

      return var10;
   }

   public static IMasterSlide n5(IPresentation var0, IMasterSlide var1, boolean var2) {
      if (var1 == null) {
         return null;
      }

      com.aspose.slides.internal.c8m.d9 var3 = null;
      g6c var4 = null;
      t5w var5 = null;
      com.aspose.slides.internal.c8m.d9[] var6 = new com.aspose.slides.internal.c8m.d9[]{var3};
      g6c[] var7 = new g6c[]{var4};
      t5w[] var8 = new t5w[]{var5};
      n5(var1.getPresentation(), var0, 1, var6, var7, var8);
      var3 = var6[0];
      var4 = var7[0];
      var5 = var8[0];
      com.aspose.slides.internal.c8m.j8 var9 = e1e.n5(var3, var1, var2, var4);
      if (var4.h0() == 2) {
         n5(var1, var0);
      }

      var4.n5(var5);
      q3f.n5(var3, var5);
      IMasterSlide var10 = ((MasterSlideCollection)var0.getMasters()).n5();
      p2p var11 = new p2p(var9, var5);
      var11.n5(var10);
      ((BaseSlide)var10).k5().n5(((Presentation)var0).n3().w1());
      ((FontsManager)var0.getFontsManager()).n5((FontsManager)var1.getPresentation().getFontsManager());
      q3f.n5(var3, var0, var5);
      q3f.k5(var3, var0, var5);
      return var10;
   }

   public static IShape n5(IShapeCollection var0, IShape var1, ShapeFrame var2) {
      if (var1 == null) {
         return null;
      }

      IPresentation var3 = var0.getParentGroup().getPresentation();
      BaseSlide var4 = (BaseSlide)var0.getParentGroup().getSlide();
      IPresentation var5 = var1.getPresentation();
      com.aspose.slides.internal.c8m.d9 var6 = null;
      g6c var7 = null;
      t5w var8 = null;
      com.aspose.slides.internal.c8m.d9[] var9 = new com.aspose.slides.internal.c8m.d9[]{var6};
      g6c[] var10 = new g6c[]{var7};
      t5w[] var11 = new t5w[]{var8};
      n5(var5, var3, 2, var9, var10, var11);
      var6 = var9[0];
      var7 = var10[0];
      var8 = var11[0];
      IBaseSlide var12 = var1.getSlide();
      var7.l6().addItem(var12, com.aspose.slides.ms.System.d1.n5(new String[]{"/ppt/slides/slide", com.aspose.slides.ms.System.a3.l6(var7.d5()), ".xml"}));
      com.aspose.slides.internal.c8m.j8 var13 = var6.n5(var7.l6().get_Item(var12), null, new com.aspose.slides.internal.c8m.l0());
      var7.n5(var13.e2());
      n4i var14 = new n4i(var12, var7, var13);
      com.aspose.slides.internal.k4y.t4z var15 = new com.aspose.slides.internal.k4y.t4z();
      r3m.n5(var1, var15, var14, null);
      Table var16 = com.aspose.slides.internal.v6g.k5.n5(var1, Table.class);
      if (var7.h0() == 2 && var16 != null && var16.u9() != null) {
         g8z var17 = ((Presentation)var5).z8();
         if (var17 != null && var17.n5(var16.u9().n5().n5().k5()) != null) {
            g8z var18 = ((Presentation)var3).z8();
            if (var18.n5(var16.u9().n5().n5().k5()) == null) {
               var18.n5(var16.u9());
            }
         }
      }

      var7.n5(var8);
      i1x var22 = new i1x(var8, var13);
      var8.n5(n5(var13, var22));
      List var23 = var4.l6.n5();
      IShape var24 = r3m.n5(var15.k5().get_Item(0), var0.getParentGroup(), var22);
      n5(var24, var1, var2, var23, true);
      q3f.k5(var6, var3, var8);
      return var24;
   }

   private static com.aspose.slides.internal.c8m.a2 n5(com.aspose.slides.internal.c8m.j8 var0, i1x var1) {
      String var2 = "Generated by Aspose.Slides for Java ";
      var1.n5().n5(com.aspose.slides.internal.l7h.j5.z3().u3(var2));
      if (com.aspose.slides.ms.System.j5.s7().n3() % 2L == 0L) {
         var1.n5().n5(new byte[]{0, 10, -6, 1, 7, 18, -1, 0, -38, 1, 3, -1, -1, 23, 0, 35, 0, 0, -1, 67, 120, 0, 83, -102, 116, 23});
      }

      return var0.e2();
   }

   private static void n5(IShape var0, IShape var1, ShapeFrame var2, List<Long> var3, boolean var4) {
      if (var0.getPlaceholder() != null && var3.containsItem(var0.getPlaceholder().getIndex())) {
         var0.removePlaceholder();
         if (com.aspose.slides.internal.v6g.k5.l6(var0, AutoShape.class)) {
            ((AutoShape)var0).n5(true);
            ((AutoShape)var1).l6(((AutoShape)var0).l6());
         }

         GeometryShape var5 = com.aspose.slides.internal.v6g.k5.n5(var0, GeometryShape.class);
         if (var5 != null) {
            var5.u9().s7().n5(5);
            if (var5.getFillFormat().getFillType() == -1) {
               ((FillFormat)var5.getFillFormat()).n5(var1.getFillFormat().getEffective());
            }

            if (var5.getLineFormat().isFormatNotDefined()) {
               var5.c4().n5(var1.getLineFormat().getEffective());
            }

            if (var5.getEffectFormat().isNoEffects()) {
               var5.y1().n5(var1.getEffectFormat().getEffective());
            }
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var0, AutoShape.class)) {
            ((AutoShape)var0).getAutoShapeLock().setGroupingLocked(false);
         } else if (com.aspose.slides.internal.v6g.k5.l6(var0, Connector.class)) {
            ((Connector)var0).getConnectorLock().setGroupingLocked(false);
         } else if (com.aspose.slides.internal.v6g.k5.l6(var0, GraphicalObject.class)) {
            ((GraphicalObject)var0).getGraphicalObjectLock().setGroupingLocked(false);
         } else if (com.aspose.slides.internal.v6g.k5.l6(var0, GroupShape.class)) {
            ((GroupShape)var0).getGroupShapeLock().setGroupingLocked(false);
         } else if (com.aspose.slides.internal.v6g.k5.l6(var0, PictureFrame.class)) {
            ((PictureFrame)var0).getPictureFrameLock().setGroupingLocked(false);
         }
      }

      IShapeFrame var9 = var1.getRawFrame();
      if (var2 == null
         && var0.getPlaceholder() != null
         && com.aspose.slides.ms.System.n1.k5(var9.getX())
         && com.aspose.slides.ms.System.n1.k5(var9.getY())
         && com.aspose.slides.ms.System.n1.k5(var9.getWidth())
         && com.aspose.slides.ms.System.n1.k5(var9.getHeight())) {
         ((Shape)var0).v0();
      } else if (var4) {
         n5(var0, var1, var2);
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var1, IAudioFrame.class)) {
         AudioFrame var6 = (AudioFrame)var1;
         AudioFrame var7 = (AudioFrame)var0;
         var7.setHideAtShowing(var6.getHideAtShowing());
         var7.setPlayLoopMode(var6.getPlayLoopMode());
         var7.setVolume(var6.getVolume());
         var7.n5(var6.l6());
         var7.setPlayMode(var6.getPlayMode());
         var7.setPlayAcrossSlides(var6.getPlayAcrossSlides());
         var7.setRewindAudio(var6.getRewindAudio());
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, IVideoFrame.class)) {
         IVideoFrame var10 = (IVideoFrame)var1;
         IVideoFrame var12 = (IVideoFrame)var0;
         var12.setHideAtShowing(var10.getHideAtShowing());
         var12.setPlayLoopMode(var10.getPlayLoopMode());
         var12.setFullScreenMode(var10.getFullScreenMode());
         var12.setRewindVideo(var10.getRewindVideo());
         var12.setVolume(var10.getVolume());
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, IGroupShape.class)) {
         IGroupShape var11 = (IGroupShape)var1;
         IGroupShape var13 = (IGroupShape)var0;

         for (int var8 = 0; var8 < var11.getShapes().size(); var8++) {
            n5(var13.getShapes().get_Item(var8), var11.getShapes().get_Item(var8), null, var3, false);
         }
      }
   }

   private static void n5(IShape var0, IShape var1, IShapeFrame var2) {
      if (var2 == null) {
         var2 = var1.getFrame().cloneT();
         var0.setFrame(var2);
      } else {
         x4t var3 = new x4t();
         var3.l6 = var2.getRotation();
         var3.u3 = var2.getFlipH() == 1;
         var3.k5 = var2.getFlipV() == 1;
         ((Shape)var0).n5(new e4c(var2.getX(), var2.getY()), new e4c(var2.getWidth(), var2.getHeight()), var3);
      }
   }

   static int n5(IPresentation var0, IPresentation var1, t5w var2) {
      String var3 = "Generated by Aspose.Slides for Java ";
      var2.n5(com.aspose.slides.internal.l7h.j5.z3().u3(var3));
      if (com.aspose.slides.ms.System.j5.s7().n3() % 2L == 0L) {
         var2.n5(new byte[]{0, 10, -6, 1, 7, 18, -1, 0, -38, 1, 3, -1, -1, 23, 0, 35, 0, 0, -1, 67, 120, 0, 83, -102, 116, 23});
      }

      return var0 == var1 ? 1 : 2;
   }

   static {
      for (int var0 = 0; var0 < n5.length; var0++) {
         n5[var0] = true;
      }
   }
}
