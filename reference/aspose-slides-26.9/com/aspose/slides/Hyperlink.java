package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.ms.System.IDisposable;

public final class Hyperlink extends PVIObject implements IHyperlink, r0g {
   static final String n5 = null;
   private IHyperlinkContainer l6;
   private final h4t k5 = new h4t();
   private int u3;
   private String a6;
   private boolean u9;
   private String h0;

   public Hyperlink(String url) {
      super(null);
      this.n5(true, url, 1);
   }

   public Hyperlink(ISlide slide) {
      super(null);
      this.n5(false, null, 8);
      this.u3().n5(slide);
   }

   public Hyperlink(Hyperlink source, String targetFrame, String tooltip, boolean history, boolean stopSoundsOnClick, boolean highlightClick) {
      super(null);
      this.n5(source.u9(), source.h0, source.getActionType());
      this.u3().n5(source.u3().n5());
      this.n5(source.a6());
      this.setTargetFrame(targetFrame);
      this.setTooltip(tooltip);
      this.setHistory(history);
      this.setStopSoundOnClick(stopSoundsOnClick);
      this.setHighlightClick(highlightClick);
      this.u3(source.t2());
   }

   Hyperlink(boolean external, String uri, int actionType) {
      super(null);
      this.n5(external, uri, actionType);
   }

   private Hyperlink(int actionType) {
      super(null);
      this.n5(false, null, actionType);
   }

   private void n5(boolean var1, String var2, int var3) {
      this.u3 = var3;
      this.u9 = var1;
      this.h0 = var2;
   }

   @Override
   Object M_() {
      return new t8f();
   }

   final t8f l6() {
      return (t8f)this.m1();
   }

   @Override
   public long getVersion() {
      return !this.z3() ? 1L : this.l6().s7();
   }

   final h4t u3() {
      return this.k5;
   }

   public static Hyperlink getNoAction() {
      return new Hyperlink(0);
   }

   public static Hyperlink getMedia() {
      return new Hyperlink(12);
   }

   public static Hyperlink getNextSlide() {
      return new Hyperlink(4);
   }

   public static Hyperlink getPreviousSlide() {
      return new Hyperlink(3);
   }

   public static Hyperlink getFirstSlide() {
      return new Hyperlink(2);
   }

   public static Hyperlink getLastSlide() {
      return new Hyperlink(5);
   }

   public static Hyperlink getLastVievedSlide() {
      return new Hyperlink(7);
   }

   public static Hyperlink getEndShow() {
      return new Hyperlink(6);
   }

   @Override
   public final int getActionType() {
      return this.u3;
   }

   @Override
   public final String getExternalUrl() {
      return this.u9 ? this.x8() : null;
   }

   @Override
   public final ISlide getTargetSlide() {
      if (this.s7() != null) {
         int var1 = this.getActionType();
         if (var1 > 1 && var1 < 6) {
            IPortionFormat var2 = com.aspose.slides.internal.v6g.k5.n5(this.s7(), IPortionFormat.class);
            IShape var3 = com.aspose.slides.internal.v6g.k5.n5(this.s7(), IShape.class);
            ISlide var4 = null;
            if (var2 != null) {
               if (com.aspose.slides.internal.v6g.k5.l6(var2, PortionFormat.class)) {
                  var4 = com.aspose.slides.internal.v6g.k5.n5(((PortionFormat)var2).getSlide(), ISlide.class);
               }
            } else if (var3 != null) {
               var4 = com.aspose.slides.internal.v6g.k5.n5(((Shape)var3).getSlide(), ISlide.class);
            }

            if (var4 != null) {
               switch (var1) {
                  case 2:
                     var4 = var4.getPresentation().getSlides().size() > 0 ? var4.getPresentation().getSlides().get_Item(0) : null;
                     break;
                  case 3:
                     var4 = var4.getSlideNumber() > 1 ? var4.getPresentation().getSlides().get_Item(var4.getSlideNumber() - 2) : null;
                     break;
                  case 4:
                     var4 = var4.getPresentation().getSlides().size() > var4.getSlideNumber()
                        ? var4.getPresentation().getSlides().get_Item(var4.getSlideNumber())
                        : null;
                     break;
                  case 5:
                     var4 = var4.getPresentation().getSlides().size() > 0
                        ? var4.getPresentation().getSlides().get_Item(var4.getPresentation().getSlides().size() - 1)
                        : null;
               }

               return var4;
            }
         }
      }

      return this.u3().n5();
   }

   final String a6() {
      if (!com.aspose.slides.ms.System.d1.n5(this.a6)) {
         return this.a6;
      }

      switch (this.u3) {
         case -1:
            return null;
         case 0:
            return "ppaction://noaction";
         case 1:
            return n5;
         case 2:
            return "ppaction://hlinkshowjump?jump=firstslide";
         case 3:
            return "ppaction://hlinkshowjump?jump=previousslide";
         case 4:
            return "ppaction://hlinkshowjump?jump=nextslide";
         case 5:
            return "ppaction://hlinkshowjump?jump=lastslide";
         case 6:
            return "ppaction://hlinkshowjump?jump=endshow";
         case 7:
            return "ppaction://hlinkshowjump?jump=lastslideviewed";
         case 8:
            return "ppaction://hlinksldjump";
         case 9:
            return "ppaction://customshow";
         case 10:
            return "ppaction://hlinkfile";
         case 11:
            return "ppaction://hlinkpres";
         case 12:
            return "ppaction://media";
         case 13:
            return com.aspose.slides.ms.System.d1.n5(new String[]{"ppaction://macro?name=", this.h0});
         case 14:
            return "ppaction://program";
         default:
            throw new NotImplementedException();
      }
   }

   final void n5(String var1) {
      this.a6 = var1;
      this.u3 = this.n3();
   }

   final boolean u9() {
      return this.u9;
   }

   final void n5(boolean var1) {
      this.u9 = var1;
   }

   final String h0() {
      if (this.u9) {
         return null;
      } else {
         return this.u3 == 13 ? "" : this.h0;
      }
   }

   final void l6(String var1) {
      if (!this.u9) {
         this.h0 = var1;
      }
   }

   @Override
   public final String getExternalUrlOriginal() {
      return this.u9 ? this.h0 : null;
   }

   final void k5(String var1) {
      if (this.u9) {
         this.h0 = var1;
      }
   }

   @Override
   public final String getTargetFrame() {
      return this.z3() ? this.l6().n5() : null;
   }

   @Override
   public final void setTargetFrame(String value) {
      this.n5((Object)null, value);
      if (this.z3()) {
         this.l6().n5(value);
      }
   }

   @Override
   public final String getTooltip() {
      return this.z3() ? this.l6().l6() : null;
   }

   @Override
   public final void setTooltip(String value) {
      this.n5((Object)null, value);
      if (this.z3()) {
         this.l6().l6(value);
      }
   }

   @Override
   public final boolean getHistory() {
      return this.z3() ? this.l6().k5() : true;
   }

   @Override
   public final void setHistory(boolean value) {
      this.n5(true, value);
      if (this.z3()) {
         this.l6().n5(value);
      }
   }

   @Override
   public final boolean getHighlightClick() {
      return this.z3() ? this.l6().u3() : false;
   }

   @Override
   public final void setHighlightClick(boolean value) {
      this.n5(false, value);
      if (this.z3()) {
         this.l6().l6(value);
      }
   }

   @Override
   public final boolean getStopSoundOnClick() {
      return this.z3() ? this.l6().a6() : false;
   }

   @Override
   public final void setStopSoundOnClick(boolean value) {
      this.n5(false, value);
      if (this.z3()) {
         this.l6().k5(value);
         if (value) {
            this.l6().n5((IAudio)null);
         }
      }
   }

   @Override
   public final IAudio getSound() {
      return this.z3() ? this.l6().u9() : null;
   }

   @Override
   public final void setSound(IAudio value) {
      this.k7();
      this.l6().n5(value);
      if (value != null) {
         this.l6().k5(false);
      }
   }

   @Override
   public final int getColorSource() {
      return this.z3() ? this.l6().h0() : 0;
   }

   @Override
   public final void setColorSource(int value) {
      this.n5(0, value);
      if (this.z3()) {
         this.l6().n5(value);
      }
   }

   final boolean c8() {
      return this.z3() ? this.l6().c8() : false;
   }

   final void l6(boolean var1) {
      this.k7();
      this.l6().u3(var1);
   }

   final String t2() {
      return this.z3() ? this.l6().t2() : null;
   }

   final void u3(String var1) {
      this.n5((Object)null, var1);
      if (this.z3()) {
         this.l6().k5(var1);
      }
   }

   @Override
   public boolean equals(Object obj) {
      Hyperlink var2 = com.aspose.slides.internal.v6g.k5.n5(obj, Hyperlink.class);
      return var2 != null && this.n5(var2);
   }

   @Override
   public final boolean equals(IHyperlink hlink) {
      return hlink != null && this.n5((Hyperlink)hlink);
   }

   private boolean n5(Hyperlink var1) {
      boolean var2 = com.aspose.slides.ms.System.d1.a6(this.getExternalUrlOriginal(), var1.getExternalUrlOriginal())
         && com.aspose.slides.ms.System.d1.a6(this.h0(), var1.h0())
         && this.getTargetSlide() == var1.getTargetSlide()
         && com.aspose.slides.ms.System.d1.a6(this.t2(), var1.t2())
         && com.aspose.slides.ms.System.d1.a6(this.a6(), var1.a6());
      return !this.z3() && !var1.z3()
         ? var2
         : var2
            && com.aspose.slides.ms.System.d1.a6(this.getTargetFrame(), var1.getTargetFrame())
            && com.aspose.slides.ms.System.d1.a6(this.getTooltip(), var1.getTooltip())
            && this.getHistory() == var1.getHistory()
            && this.getHighlightClick() == var1.getHighlightClick()
            && this.getStopSoundOnClick() == var1.getStopSoundOnClick()
            && this.getColorSource() == var1.getColorSource()
            && this.getSound() == var1.getSound();
   }

   public static boolean op_Equality(Hyperlink hlink1, Hyperlink hlink2) {
      if (com.aspose.slides.ms.System.j8.l6(hlink1, hlink2)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.l6(hlink1, null) ? false : hlink1.equals(hlink2);
      }
   }

   public static boolean op_Inequality(Hyperlink hlink1, Hyperlink hlink2) {
      if (com.aspose.slides.ms.System.j8.l6(hlink1, hlink2)) {
         return false;
      } else {
         return com.aspose.slides.ms.System.j8.l6(hlink1, null) ? true : !hlink1.equals(hlink2);
      }
   }

   @Override
   public int hashCode() {
      return (this.t2() != null ? this.t2().hashCode() : 0) + (this.a6() != null ? this.a6().hashCode() : 0);
   }

   private String x8() {
      if (this.l6 == null) {
         return this.h0;
      }

      String var1 = this.h0;
      String var2 = "";
      com.aspose.slides.ms.System.r8 var3 = null;
      IParagraph var4 = null;
      IParagraph[] var5 = new IParagraph[]{var4};
      boolean var6 = d0u.n5(IParagraph.class, (r0g)this.l6, var5);
      var4 = var5[0];
      if (var6) {
         IGenericEnumerator var7 = var4.getPortions().iterator();

         try {
            while (var7.hasNext()) {
               IPortion var8 = (IPortion)var7.next();
               if (!this.equals(var8.getPortionFormat().getHyperlinkClick()) && !this.equals(var8.getPortionFormat().getHyperlinkMouseOver())) {
                  if (!"".equals(var2)) {
                     break;
                  }
               } else {
                  String var9 = com.aspose.slides.ms.System.d1.n5(new String[]{var2, ((Portion)var8).u9()});
                  com.aspose.slides.ms.System.r8[] var10 = new com.aspose.slides.ms.System.r8[]{var3};
                  boolean var11 = com.aspose.slides.ms.System.r8.n5(var9, 1, var10)
                     && !com.aspose.slides.ms.System.d1.t2(var9, " ")
                     && com.aspose.slides.internal.r7c.c8.k5(var9, "^((https?|ftp|file)\\:\\/)|[a-z]\\:\\\\", 66);
                  var3 = var10[0];
                  if (!var11) {
                     break;
                  }

                  var2 = var9;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
               var7.dispose();
            }
         }
      }

      if (!"".equals(var2)) {
         com.aspose.slides.ms.System.r8 var16 = null;
         com.aspose.slides.ms.System.r8[] var18 = new com.aspose.slides.ms.System.r8[]{var16};
         boolean var19 = ((Presentation)var4.getPresentation()).m3() == 0
            && (
               com.aspose.slides.ms.System.d1.a6(this.k5.k5(), var2)
                  || var3 != null
                     && com.aspose.slides.ms.System.r8.n5(this.h0, 1, var18)
                     && com.aspose.slides.ms.System.d1.a6(var18[0].l6(), var3.l6())
                     && !com.aspose.slides.ms.System.d1.a6(var3.m1(), var3.l6())
            );
         var16 = var18[0];
         if (var19) {
            return var1;
         }

         var1 = a6(var2);
      }

      return var1;
   }

   private static String a6(String var0) {
      String var1 = var0;
      var1 = com.aspose.slides.ms.System.d1.n5(var1, "%20", " ");
      var1 = com.aspose.slides.ms.System.d1.n5(var1, "%", "%25");
      var1 = com.aspose.slides.ms.System.d1.n5(var1, "[", "%5B");
      var1 = com.aspose.slides.ms.System.d1.n5(var1, "]", "%5D");
      var1 = com.aspose.slides.ms.System.d1.n5(var1, "<", "%3C");
      var1 = com.aspose.slides.ms.System.d1.n5(var1, ">", "%3E");
      var1 = com.aspose.slides.ms.System.d1.n5(var1, "{", "%7B");
      var1 = com.aspose.slides.ms.System.d1.n5(var1, "}", "%7D");
      var1 = com.aspose.slides.ms.System.d1.n5(var1, "^", "%5E");
      return com.aspose.slides.ms.System.d1.n5(var1, " ", "%20");
   }

   @Override
   public final r0g getParent_Immediate() {
      return (r0g)this.l6;
   }

   final IHyperlinkContainer s7() {
      return this.l6;
   }

   final void n5(IHyperlinkContainer var1) {
      this.l6 = var1;
   }

   final boolean k5(boolean var1) {
      String var2 = var1 ? this.getExternalUrlOriginal() : this.getExternalUrl();
      return com.aspose.slides.ms.System.d1.n5(var2) ? false : com.aspose.slides.internal.r7c.c8.k5(var2, "javascript:([a-zA-Z0-9_]+)(\\(.*\\))", 66);
   }

   private int n3() {
      if (com.aspose.slides.ms.System.d1.n5(this.a6)) {
         return 1;
      } else {
         String var1 = com.aspose.slides.ms.System.d1.u9(this.a6());
         if (!com.aspose.slides.ms.System.d1.l6(var1, "ppaction://")) {
            return -1;
         } else if (com.aspose.slides.ms.System.d1.l6(var1, "ppaction://noaction")) {
            return 0;
         } else if (com.aspose.slides.ms.System.d1.l6(var1, "ppaction://hlinkshowjump?jump=firstslide")) {
            return 2;
         } else if (com.aspose.slides.ms.System.d1.l6(var1, "ppaction://hlinkshowjump?jump=previousslide")) {
            return 3;
         } else if (com.aspose.slides.ms.System.d1.l6(var1, "ppaction://hlinkshowjump?jump=nextslide")) {
            return 4;
         } else if (com.aspose.slides.ms.System.d1.l6(var1, "ppaction://hlinkshowjump?jump=lastslideviewed")) {
            return 7;
         } else if (com.aspose.slides.ms.System.d1.l6(var1, "ppaction://hlinkshowjump?jump=lastslide")) {
            return 5;
         } else if (com.aspose.slides.ms.System.d1.l6(var1, "ppaction://hlinkshowjump?jump=endshow")) {
            return 6;
         } else if (com.aspose.slides.ms.System.d1.l6(var1, "ppaction://hlinksldjump")) {
            return 8;
         } else if (com.aspose.slides.ms.System.d1.l6(var1, "ppaction://hlinkfile")) {
            return 10;
         } else if (com.aspose.slides.ms.System.d1.l6(var1, "ppaction://hlinkpres")) {
            return 11;
         } else if (com.aspose.slides.ms.System.d1.l6(var1, "ppaction://media")) {
            return 12;
         } else if (com.aspose.slides.ms.System.d1.l6(var1, "ppaction://macro?name=")) {
            return 13;
         } else if (com.aspose.slides.ms.System.d1.l6(var1, "ppaction://program")) {
            return 14;
         } else {
            return com.aspose.slides.ms.System.d1.l6(var1, "ppaction://customshow") ? 9 : -1;
         }
      }
   }
}
