Scenario: Registration of a new user
Given I am on the Main page
When I navigate to the Register page
And I fill in registration details
Then I am registered successfully

Scenario: Login of a registered user
Given I am on the Main page
When I navigate to the Login page and enter user credentials
Then I am logged in successfully

Scenario: Validate Computers group has three sub-groups
Given I am on the Computers page
Then There are three sub-groups with correct names

Scenario: Validate sorting of items
Given I am on an items page
When I sort items by different options
Then Items are sorted correctly

Scenario: Change number of displayed items per page
Given I am on an items page
When I change the number of displayed items
Then Number of items changed as per setting

Scenario: Add item to Wishlist
Given I am on an items page
When I select an item and add it to the Wishlist
Then The item is added to my Wishlist successfully

Scenario: Add item to the cart
Given I am on an items page
When I select an item and add it to the cart
Then The item is added to my cart successfully

Scenario: Remove item from the cart
Given I have added items in the cart
When I remove an item from the cart
Then The item is removed from the cart successfully

Scenario: Checkout an item from the cart
Given I have added items in the cart
When I proceed to checkout
Then I complete the purchase