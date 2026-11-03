package com.aspose.slides;

class HyperlinkQueries$3 extends HyperlinkQueries$n5 {
   // $VF: synthetic field
   final HyperlinkQueries n5;

   HyperlinkQueries$3(HyperlinkQueries var1) {
      super(null);
      this.n5 = var1;
   }

   @Override
   public boolean n5(IHyperlinkContainer var1) {
      return var1.getHyperlinkClick() != null || var1.getHyperlinkMouseOver() != null;
   }
}
