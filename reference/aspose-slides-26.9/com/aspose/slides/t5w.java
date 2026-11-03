package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.IDisposable;

class t5w extends com.aspose.slides.internal.c8m.e9 {
   private boolean n5;
   private boolean l6;
   private Presentation k5;
   private int u3 = 0;
   private byte[] a6;
   private final InterruptionToken u9;
   private final Dictionary<String, IPPImage> h0;
   private final Dictionary<com.aspose.slides.internal.c8m.j8, IPPImage> c8;
   private final Dictionary<com.aspose.slides.internal.c8m.j8, IAudio> t2;
   private final Dictionary<com.aspose.slides.internal.c8m.j8, IVideo> s7;
   private final Dictionary<com.aspose.slides.internal.c8m.j8, ITheme> x8;
   private final Dictionary<com.aspose.slides.internal.c8m.j8, ICustomXmlPart> n3;
   private final Dictionary<com.aspose.slides.internal.c8m.j8, n4> y4;
   private final Dictionary<String, List<IHyperlink>> e2;
   private final Dictionary<Integer, List<IHyperlink>> t9;
   private final Dictionary<Long, ICommentAuthor> z1;
   private final Dictionary<com.aspose.slides.ms.System.o0, ICommentAuthor> t4;
   private final Dictionary<String, IBaseSlide> q0;
   private final List<IShape> z3 = new List<>();
   private final SortedList<String, SortedList<String, com.aspose.slides.internal.c8m.j8>> m1;

   public t5w(IPresentation var1, InterruptionToken var2) {
      this.k5 = (Presentation)var1;
      this.u9 = var2;
      this.h0 = new Dictionary<>();
      this.c8 = new Dictionary<>();
      this.t2 = new Dictionary<>();
      this.s7 = new Dictionary<>();
      this.x8 = new Dictionary<>();
      this.y4 = new Dictionary<>();
      this.n3 = new Dictionary<>();
      this.e2 = new Dictionary<>();
      this.t9 = new Dictionary<>();
      this.z1 = new Dictionary<>();
      this.t4 = new Dictionary<>();
      this.q0 = new Dictionary<>();
      this.m1 = new SortedList<>();
   }

   public t5w(IPresentation var1, InterruptionToken var2, boolean var3) {
      this(var1, var2);
      this.l6(var3);
   }

   final void n5() {
      IGenericEnumerator var1 = this.t9().getCommentAuthors().iterator();

      try {
         while (var1.hasNext()) {
            ICommentAuthor var2 = (ICommentAuthor)var1.next();
            this.t2().addItem(((CommentAuthor)var2).l6().n5(), var2);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }
   }

   final IPPImage n5(String var1) {
      return ((ImageCollection)this.k5.getImages()).n5(var1, this.h0);
   }

   final IPPImage n5(com.aspose.slides.internal.c8m.j8 var1) {
      if (var1 == null) {
         String var2 = "Empty image part.";
         this.n5(var2, 1);
         return ((ImageCollection)this.k5.getImages()).n5();
      }

      if (com.aspose.slides.ms.System.d1.k5(com.aspose.slides.ms.System.d1.u9(var1.l6()), ".svg")) {
         return null;
      }

      if ((!com.aspose.slides.ms.System.d1.k5(com.aspose.slides.ms.System.d1.u9(var1.l6()), ".pdf") || com.aspose.slides.internal.n8e.k7.n5(var1.a6()))
         && !com.aspose.slides.ms.System.d1.k5(com.aspose.slides.ms.System.d1.u9(var1.l6()), ".webp")
         && !com.aspose.slides.ms.System.d1.k5(com.aspose.slides.ms.System.d1.u9(var1.l6()), ".pict")) {
         return !this.c8.containsKey(var1) ? this.u9(var1) : this.c8.get_Item(var1);
      }

      ((ImageCollection)this.t9().getImages()).k5(var1.l6());
      return null;
   }

   private IPPImage u9(com.aspose.slides.internal.c8m.j8 var1) {
      IPPImage var2;
      try {
         var2 = var1.t2() == null ? this.t9().getImages().addImage(var1.a6()) : ((ImageCollection)this.t9().getImages()).n5(var1.t2());
      } catch (com.aspose.slides.internal.e5a.f2 var5) {
         var1.n5(true);
         String var8 = com.aspose.slides.ms.System.d1.n5("Embedded image is corrupted: {0}", new Object[]{var1.l6()});
         this.n5(var8, 1);
         return null;
      } catch (com.aspose.slides.internal.e5a.k5 var6) {
         String var4 = com.aspose.slides.ms.System.d1.n5("Error occured loading image: {0}", new Object[]{var6.getMessage()});
         this.n5(var4, 1);
         return null;
      } catch (Exception var7) {
         com.aspose.slides.internal.n8e.v4.n5(var7);
         ((ImageCollection)this.t9().getImages()).l6(var1.l6());
         return null;
      }

      this.c8.addItem(var1, var2);
      var1.n5(true);
      return var2;
   }

   final Dictionary<com.aspose.slides.internal.c8m.j8, IPPImage> l6() {
      return this.c8;
   }

   final IAudio l6(com.aspose.slides.internal.c8m.j8 var1) {
      IAudio var2 = null;
      IAudio[] var3 = new IAudio[]{var2};
      boolean var4 = this.t2.tryGetValue(var1, var3);
      var2 = var3[0];
      if (var4) {
         return var2;
      }

      AudioCollection var5 = (AudioCollection)this.t9().getAudios();
      IVideo var6 = null;
      IVideo[] var7 = new IVideo[]{var6};
      boolean var8 = this.s7.tryGetValue(var1, var7);
      var6 = var7[0];
      Audio var9;
      if (var8) {
         var9 = (Audio)var5.n5(((Video)var6).a6());
      } else {
         var9 = var1.t2() == null ? (Audio)var5.addAudio(var1.a6()) : (Audio)var5.n5(var1.t2());
      }

      var9.setContentType(var1.y4().n5());
      int var10 = com.aspose.slides.ms.System.d1.k5(var1.l6(), '.');
      var9.n5(var10 >= 0 ? com.aspose.slides.ms.System.d1.k5(var1.l6(), var10 + 1) : null);
      var9.n5().n5(com.aspose.slides.ms.System.d1.n5(var1.l6(), "/ppt/media/", ""));
      this.t2.addItem(var1, var9);
      var1.n5(true);
      return var9;
   }

   final Dictionary<com.aspose.slides.internal.c8m.j8, IAudio> k5() {
      return this.t2;
   }

   final IVideo k5(com.aspose.slides.internal.c8m.j8 var1) {
      if (!this.s7.containsKey(var1)) {
         Video var2 = var1.t2() == null
            ? ((VideoCollection)this.t9().getVideos()).n5(var1.a6(), null, null)
            : ((VideoCollection)this.t9().getVideos()).n5(var1.t2(), null, null);
         this.s7.addItem(var1, var2);
         var1.n5(true);
         return var2;
      } else {
         return this.s7.get_Item(var1);
      }
   }

   final Dictionary<com.aspose.slides.internal.c8m.j8, IVideo> u3() {
      return this.s7;
   }

   final ICustomXmlPart u3(com.aspose.slides.internal.c8m.j8 var1) {
      if (!this.n3.containsKey(var1)) {
         CustomXmlPart var2 = new CustomXmlPart(this.t9(), var1.a6(), com.aspose.slides.ms.System.o0.l6().k5(), new String[0]);
         this.n3.addItem(var1, var2);
         var1.n5(true);
         return var2;
      } else {
         return this.n3.get_Item(var1);
      }
   }

   final n4 a6(com.aspose.slides.internal.c8m.j8 var1) {
      if (!this.y4.containsKey(var1)) {
         n4 var2 = var1.t2() == null ? this.t9().z3().n5(var1.a6()) : this.t9().z3().n5(var1.t2());
         this.y4.addItem(var1, var2);
         var1.n5(true);
         return var2;
      } else {
         return this.y4.get_Item(var1);
      }
   }

   final Dictionary<com.aspose.slides.internal.c8m.j8, n4> a6() {
      return this.y4;
   }

   final int u9() {
      return this.u3;
   }

   final void n5(int var1) {
      this.u3 = var1;
   }

   final Dictionary<String, List<IHyperlink>> h0() {
      return this.e2;
   }

   final Dictionary<Integer, List<IHyperlink>> c8() {
      return this.t9;
   }

   final Dictionary<Long, ICommentAuthor> t2() {
      return this.z1;
   }

   final Dictionary<com.aspose.slides.ms.System.o0, ICommentAuthor> s7() {
      return this.t4;
   }

   final Dictionary<String, IBaseSlide> x8() {
      return this.q0;
   }

   final List<IShape> n3() {
      return this.z3;
   }

   final SortedList<String, SortedList<String, com.aspose.slides.internal.c8m.j8>> y4() {
      return this.m1;
   }

   final Dictionary<com.aspose.slides.internal.c8m.j8, ITheme> e2() {
      return this.x8;
   }

   final Presentation t9() {
      return this.k5;
   }

   final InterruptionToken z1() {
      return this.u9;
   }

   final byte[] t4() {
      return this.a6;
   }

   final void n5(byte[] var1) {
      this.a6 = var1;
   }

   public final boolean q0() {
      return this.n5;
   }

   public final void n5(boolean var1) {
      this.n5 = var1;
   }

   final boolean z3() {
      return this.l6;
   }

   final void l6(boolean var1) {
      this.l6 = var1;
   }

   final void n5(String var1, int var2) {
      if (this.t9().a6() != null && this.t9().a6().getWarningCallback() != null) {
         com.aspose.slides.internal.n8e.u6 var3 = new com.aspose.slides.internal.n8e.u6(var1, var2);
         var3.sendWarning(this.t9().a6().getWarningCallback());
      }
   }

   final void m1() {
      Dictionary$Enumerator var1 = this.h0().iterator();

      try {
         while (var1.hasNext()) {
            KeyValuePair var2 = (KeyValuePair)var1.next();
            String var3 = (String)var2.getKey();
            ISlide var4;
            switch (this.u9()) {
               case 0:
               case 3:
                  if (this.x8().containsKey(var3)) {
                     var4 = (ISlide)this.x8().get_Item(var3);
                  } else {
                     var4 = null;
                  }
                  break;
               case 1:
               case 2:
                  var4 = y1w.n5(var3, this);
                  break;
               default:
                  throw new ArgumentOutOfRangeException();
            }

            List var5 = (List)var2.getValue();
            List$Enumerator var6 = var5.iterator();

            try {
               while (var6.hasNext()) {
                  IHyperlink var7 = (IHyperlink)var6.next();
                  ((Hyperlink)var7).u3().n5(var4);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
                  var6.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      Dictionary$Enumerator var43 = this.c8().iterator();

      try {
         while (var43.hasNext()) {
            KeyValuePair var44 = (KeyValuePair)var43.next();
            if ((Integer)var44.getKey() < this.k5.getSlides().size()) {
               ISlide var46 = this.k5.getSlides().get_Item((Integer)var44.getKey());
               List var48 = (List)var44.getValue();
               List$Enumerator var50 = var48.iterator();

               try {
                  while (var50.hasNext()) {
                     IHyperlink var51 = (IHyperlink)var50.next();
                     ((Hyperlink)var51).u3().n5(var46);
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var50, IDisposable.class)) {
                     var50.dispose();
                  }
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var43, IDisposable.class)) {
            var43.dispose();
         }
      }

      IGenericEnumerator var45 = this.k5.getHyperlinkQueries().getHyperlinkClicks().iterator();

      try {
         while (var45.hasNext()) {
            IHyperlinkContainer var47 = (IHyperlinkContainer)var45.next();
            IHyperlink var49 = var47.getHyperlinkClick();
            if (var49.getActionType() == 8 && var49.getTargetSlide() == null) {
               var47.getHyperlinkManager().removeHyperlinkClick();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var45, IDisposable.class)) {
            var45.dispose();
         }
      }
   }
}
