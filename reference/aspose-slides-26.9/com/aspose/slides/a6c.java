package com.aspose.slides;

class a6c extends a8m<IHyperlinkContainer, a6c> {
   public static final a6c n5 = new a6c();

   protected boolean n5(IHyperlinkContainer var1, IHyperlinkContainer var2) {
      return l6r.n5.equals(var1.getHyperlinkClick(), var2.getHyperlinkClick()) && l6r.n5.equals(var1.getHyperlinkMouseOver(), var2.getHyperlinkMouseOver());
   }

   protected int n5(IHyperlinkContainer var1) {
      int var2 = -324743029 + l6r.n5.l6(var1.getHyperlinkClick());
      return var2 * 486187739 + l6r.n5.l6(var1.getHyperlinkMouseOver());
   }
}
