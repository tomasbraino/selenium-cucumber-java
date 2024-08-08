Feature: Navigation Bar
  To see the subpages
  Without login in
  I can click the navigation bar links

  #Scenario Outline: I can access to subpages through the navigation bar
   # Given I navigate to www.freerangetesters.com
    #When  I go to <section> using the navigation bar
    #Examples:
     # | section   |
      #| Cursos    |
     # | Recursos  |
      #| Blog      |
      #| Mentorías |
      #| Mentorías |
      #| Udemy     |

    Scenario: The navigation to the page is correct. Now I want to navigate through a section link "Cursos"
      Given I navigate to www.freerangetesters.com
      When I go to Cursos using the navigation bar
      And I click in fundamentos del testing



