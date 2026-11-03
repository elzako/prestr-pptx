package com.aspose.slides;

final class t8f {
   private IAudio n5;
   private String l6 = null;
   private String k5 = null;
   private boolean u3 = true;
   private boolean a6 = false;
   private boolean u9 = false;
   private int h0 = 0;
   private String c8 = null;
   private boolean t2 = false;

   public t8f() {
   }

   public final String n5() {
      return this.l6;
   }

   public final void n5(String var1) {
      this.l6 = var1;
   }

   public final String l6() {
      return this.k5;
   }

   public final void l6(String var1) {
      this.k5 = var1;
   }

   public final boolean k5() {
      return this.u3;
   }

   public final void n5(boolean var1) {
      this.u3 = var1;
   }

   public final boolean u3() {
      return this.a6;
   }

   public final void l6(boolean var1) {
      this.a6 = var1;
   }

   public final boolean a6() {
      return this.u9;
   }

   public final void k5(boolean var1) {
      this.u9 = var1;
   }

   public final IAudio u9() {
      return this.n5;
   }

   public final void n5(IAudio var1) {
      this.n5 = var1;
   }

   public final int h0() {
      return this.h0;
   }

   public final void n5(int var1) {
      this.h0 = var1;
   }

   public final boolean c8() {
      return this.t2;
   }

   public final void u3(boolean var1) {
      this.t2 = var1;
   }

   public final String t2() {
      return this.c8;
   }

   public final void k5(String var1) {
      this.c8 = var1;
   }

   @Override
   public boolean equals(Object obj) {
      Hyperlink var2 = com.aspose.slides.internal.v6g.k5.n5(obj, Hyperlink.class);
      return var2 != null && this.n5(var2);
   }

   private boolean n5(Hyperlink var1) {
      return com.aspose.slides.ms.System.d1.a6(this.n5(), var1.getTargetFrame())
         && com.aspose.slides.ms.System.d1.a6(this.l6(), var1.getTooltip())
         && this.k5() == var1.getHistory()
         && this.u3() == var1.getHighlightClick()
         && this.a6() == var1.getStopSoundOnClick()
         && this.h0() == var1.getColorSource()
         && this.u9() == var1.getSound();
   }

   @Override
   public int hashCode() {
      return super.hashCode();
   }

   final long s7() {
      return 1L;
   }
}
